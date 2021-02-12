package com.zup.cqc.Author;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String description;

    private Date registerDate;

    public Author(String name, String email, String description){
        this.name = name;
        this.email = email;
        this.description = description;
        this.registerDate = new Date();
    }
}
