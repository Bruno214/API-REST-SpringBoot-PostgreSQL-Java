package com.dio.springweb.myprojectwebapi.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserRequestDTO(

        @NotNull(message = "Username cannot be null")
        @Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters in length")
        String userName,

        @NotNull(message = "Password cannot be null")
        @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters in length")
        String password) {
}
