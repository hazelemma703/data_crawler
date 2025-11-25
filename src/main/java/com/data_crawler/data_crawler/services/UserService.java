package com.data_crawler.data_crawler.services;

import com.data_crawler.data_crawler.dto.UserLoginDTO;
import com.data_crawler.data_crawler.dto.UserRegistrationDTO;
import com.data_crawler.data_crawler.models.UserLoginData;
import com.data_crawler.data_crawler.models.UserRegistrationData;
import com.data_crawler.data_crawler.repositories.UserLoginRepository;
import com.data_crawler.data_crawler.repositories.UserRegistrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserLoginRepository userLoginRepository;
    private final UserRegistrationRepository userRegistrationRepository;

    public UserService(UserLoginRepository userLoginRepository, UserRegistrationRepository userRegistrationRepository) {
        this.userLoginRepository = userLoginRepository;
        this.userRegistrationRepository = userRegistrationRepository;
    }

    public List<UserLoginData> getUserLoginData() {
        return this.userLoginRepository.findAll();
    }

    public List<UserRegistrationData> getUserRegistrationData() {
        return this.userRegistrationRepository.findAll();
    }

    public long getUserLoginDataCount() {
        return this.userLoginRepository.count();
    }

    public long getUserRegistrationDataCount() {
        return this.userRegistrationRepository.count();
    }

    public void saveUserLoginData(UserLoginDTO data) {
        new UserLoginData();
        UserLoginData userLoginData = UserLoginData.builder()
            .username(data.getUsername())
            .password(data.getPassword())
            .build();
        this.userLoginRepository.save(userLoginData);
    }

    public void saveUserRegistrationData(UserRegistrationDTO data) {
        new UserRegistrationData();
        UserRegistrationData userRegistrationData = UserRegistrationData.builder()
            .email(data.getEmail())
            .password(data.getPassword())
            .code(data.getCode())
            .build();
        this.userRegistrationRepository.save(userRegistrationData);
    }
}
