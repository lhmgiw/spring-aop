package com.example.springaop.service;

import com.example.springaop.dto.ResponseDTO;
import com.example.springaop.dto.UserDTO;

public interface UserService {
    ResponseDTO<Object> getAllUsers();
}
