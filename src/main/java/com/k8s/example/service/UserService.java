package com.k8s.example.service;

import com.k8s.example.data.Users;
import java.util.List;

public interface UserService {
    List<Users> getAllUsers();
    Users getUserById(Integer id);
}
