package com.kaan.queuetest.repository;

import com.kaan.queuetest.entity.Content;
import org.springframework.data.repository.CrudRepository;

public interface ContentRepository extends CrudRepository<Content, Long> {
}
