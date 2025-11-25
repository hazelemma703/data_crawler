package com.data_crawler.data_crawler.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_login_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class UserLoginData {
    @Id
    private String id;
    private String username;
    private String password;
    private String loginTimestamp;
}
