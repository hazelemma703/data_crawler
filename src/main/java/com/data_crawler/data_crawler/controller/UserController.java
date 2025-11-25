package com.data_crawler.data_crawler.controller;

import com.data_crawler.data_crawler.Html;
import com.data_crawler.data_crawler.dto.UserLoginDTO;
import com.data_crawler.data_crawler.dto.UserRegistrationDTO;
import com.data_crawler.data_crawler.models.UserLoginData;
import com.data_crawler.data_crawler.models.UserRegistrationData;
import com.data_crawler.data_crawler.services.EmailService;
import com.data_crawler.data_crawler.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    private UserService userService;
    private EmailService emailService;

    public UserController(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }

    @GetMapping("/registrations")
    public ResponseEntity<List<UserRegistrationData>> findAll() {
        return ResponseEntity.ok().body(userService.getUserRegistrationData());
    }

    @GetMapping("/login-all")
    public ResponseEntity<List<UserLoginData>> getLoginAllData() {
        return ResponseEntity.ok().body(userService.getUserLoginData());
    }

    @GetMapping("/registrations/count")
    public long getRegistrationDataCount() {
        return userService.getUserRegistrationDataCount();
    }

    @GetMapping("/login/count")
    public long getLoginDataCount() {
        return userService.getUserLoginDataCount();
    }

    @PostMapping("/login")
    public void saveLoginData(@RequestBody UserLoginDTO data) {
        userService.saveUserLoginData(data);
    }

    @PostMapping("/signup")
    public void saveRegistrationData(@RequestBody UserRegistrationDTO data) {
        userService.saveUserRegistrationData(data);
    }

    @GetMapping("/sendVerifyCode")
    public ResponseEntity<?> sendVerifyCode(@RequestParam String to) {
        Long code = (long) (Math.random() * 900000L) + 100000L;
        String message = Html.getHtml(code);
        String subject = "DeepSeek Email Verification Code";
        emailService.sendEmail(to, subject, message);

        String res = "Verification code sent, please check your email.";
        return ResponseEntity.ok().body(res);
    }
}
