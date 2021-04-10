package com.kaan.queuetest.repository;

import com.kaan.queuetest.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
