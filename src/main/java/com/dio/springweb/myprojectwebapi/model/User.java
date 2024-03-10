package com.dio.springweb.myprojectwebapi.model;

import com.dio.springweb.myprojectwebapi.DTO.UserRequestDTO;
import com.dio.springweb.myprojectwebapi.DTO.UserRequestUpdateDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 20)
    private String userName;

    @Column(nullable = false, length = 20)
    private String password;

    public User(UserRequestDTO user) {
        this.userName = user.userName();
        this.password = user.password();
    }

    public User(UserRequestUpdateDTO user) {
        this.userName = user.userName();
        this.password = user.password() != null ? user.password() : this.password;
    }
}
