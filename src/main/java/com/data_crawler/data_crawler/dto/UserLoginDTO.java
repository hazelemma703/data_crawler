package com.data_crawler.data_crawler.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class UserLoginDTO {
    private String username;
    private String password;
}
