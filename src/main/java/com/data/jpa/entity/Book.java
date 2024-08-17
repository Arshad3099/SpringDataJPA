package com.data.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Setter
@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "isbn")
    private String isbn;

    public Book(Long id, String title, String publisher, String isbn) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book() {
    }

}
