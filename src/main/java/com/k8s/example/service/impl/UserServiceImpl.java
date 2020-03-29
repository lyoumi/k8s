package com.k8s.example.service.impl;

import com.k8s.example.repository.UsersRepository;
import com.k8s.example.data.Users;
import com.k8s.example.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUserById(Integer id) {
        return usersRepository.getOne(id);
    }
}
