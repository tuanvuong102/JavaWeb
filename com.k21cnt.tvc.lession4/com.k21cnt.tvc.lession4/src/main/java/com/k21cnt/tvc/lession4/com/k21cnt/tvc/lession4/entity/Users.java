package com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder

public class Users {
    Long id;
    String username;
    String password;
    String fullname;
    LocalDate dateOfbirth;
    String email;
    String phone;
    int age;
    boolean active;

}