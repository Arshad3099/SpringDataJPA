package com.data.jpa.repository;

import com.data.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
