package com.dio.springweb.myprojectwebapi.service;

import com.dio.springweb.myprojectwebapi.DTO.UserRequestDTO;
import com.dio.springweb.myprojectwebapi.model.User;
import com.dio.springweb.myprojectwebapi.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listUsers() {
        return userRepository.findAll();
    }

    public User saveUser(UserRequestDTO userDto) {
        return userRepository.save(new User(userDto));
    }

    public void deleteUserById(Long userId) {

        if (userId != null && userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return;
        }

        throw new EntityNotFoundException("O usuário não foi encontrado no banco para ser deletado");
    }

    public User updateUser(Long userId, User userDto) {
        Optional<User> userEntity = userRepository.findById(userId);

        if (userEntity.isPresent()) {
            User user = userEntity.get();
            user.setUserName(userDto.getUserName());

            if (userDto.getPassword() != null) {
                user.setPassword(userDto.getPassword());
            }

            return userRepository.save(user);
        }

        throw new EntityNotFoundException("O usuário não foi encontrado para ser atualizado");
    }
}