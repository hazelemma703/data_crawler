package com.data_crawler.data_crawler.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class UserRegistrationDTO{
    private String email;
    private String password;
    private String code;
}
