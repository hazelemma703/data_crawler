package com.data_crawler.data_crawler.repositories;

import com.data_crawler.data_crawler.models.UserLoginData;
import com.data_crawler.data_crawler.models.UserRegistrationData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRegistrationRepository extends MongoRepository<UserRegistrationData, String> {
    public long count();
}
