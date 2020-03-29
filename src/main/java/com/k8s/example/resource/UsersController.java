package com.k8s.example.resource;

import com.k8s.example.data.Users;
import com.k8s.example.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/users")
@RestController
public class UsersController {

    private final UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public Users getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }
}
