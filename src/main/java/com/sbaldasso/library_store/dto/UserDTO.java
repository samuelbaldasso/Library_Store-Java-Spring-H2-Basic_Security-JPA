package com.sbaldasso.library_store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String username;

    private String email;

    private String password;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
