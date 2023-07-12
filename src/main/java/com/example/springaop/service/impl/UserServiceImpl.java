package com.example.springaop.service.impl;

import com.example.springaop.dto.ResponseDTO;
import com.example.springaop.dto.UserDTO;
import com.example.springaop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public ResponseDTO<Object> getAllUsers() {

        List<UserDTO> users = Arrays.asList(new UserDTO("Gayan", 20),
                new UserDTO("Indunil", 25),
                new UserDTO("Dasun", 27));

        log.info("Testtttt...");

        return new ResponseDTO<>("SUCCESS", "Users found success", users);
    }
}
