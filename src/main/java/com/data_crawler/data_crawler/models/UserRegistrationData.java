package com.data_crawler.data_crawler.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_registration_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class UserRegistrationData {
    @Id
    private String id;
    private String email;
    private String password;
    private String code;
    private String registrationTimestamp;
}
