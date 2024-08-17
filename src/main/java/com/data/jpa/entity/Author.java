package com.data.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_no")
    private String phoneNo;

    public Author(Long id, String firstName, String lastName, String phoneNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }

    public Author() {
    }

}
