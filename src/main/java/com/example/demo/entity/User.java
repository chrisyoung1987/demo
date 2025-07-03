package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(exclude = "password")
public class User {
    private Long id;
    private String username;
    private String password; // BCryptなどで暗号化済み
}
