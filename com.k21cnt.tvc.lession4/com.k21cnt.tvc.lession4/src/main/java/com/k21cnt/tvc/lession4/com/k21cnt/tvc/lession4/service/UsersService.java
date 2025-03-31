package com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.service;

import com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.dto.UsersDTO;
import com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.entity.Users;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    private final List<Users> userList = new ArrayList<>();

    public UsersService() {
        userList.add(new Users(1L, "user1", "pass1", "John Doe",
                LocalDate.parse("1990-01-01"), "john@example.com", "1234567890", 34, true));
        userList.add(new Users(2L, "user2", "pass2", "Jane Smith",
                LocalDate.parse("1992-05-15"), "jane@example.com", "0987654321", 32, false));
        userList.add(new Users(3L, "user3", "pass3", "Alice Johnson",
                LocalDate.parse("1985-11-22"), "alice@example.com", "1122334455", 39, true));
        userList.add(new Users(4L, "user4", "pass4", "Bob Brown",
                LocalDate.parse("1988-03-18"), "bob@example.com", "6677889900", 36, true));
        userList.add(new Users(5L, "user5", "pass5", "Charlie White",
                LocalDate.parse("1995-09-30"), "charlie@example.com", "4433221100", 29, false));
    }

    public List<Users> findAll() {
        return userList;
    }
    public Boolean create(UsersDTO usersDTO) {
        try {
            Users user = new Users();
            user.setId((long) (userList.size() + 1)); // Sửa cách đặt ID
            user.setUsername(usersDTO.getUsername());
            user.setPassword(usersDTO.getPassword());
            user.setEmail(usersDTO.getEmail());

            user.setPhone(usersDTO.getPhone());
            user.setAge(usersDTO.getAge());

            user.setActive(usersDTO.getStatus()); // Sửa từ setStatus thành setActive()

            userList.add(user); // Chỉ thêm một lần

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
