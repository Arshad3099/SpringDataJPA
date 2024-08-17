package com.data.jpa.repository;

import com.data.jpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
