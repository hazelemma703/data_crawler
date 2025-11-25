package com.data_crawler.data_crawler.repositories;

import com.data_crawler.data_crawler.models.UserLoginData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserLoginRepository extends MongoRepository<UserLoginData, String> {
    long count();
}
