package com.zup.cqc.author;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message="{NotBlank}")
    private String name;

    @NotBlank(message="{NotBlank}")
    @Email(message="{Email}")
    private String email;

    @NotBlank
    @Length(max=400, message="{Length.description}")
    private String description;

    private LocalDateTime registerDate;

    public Author(String name, String email, String description){
        this.name = name;
        this.email = email;
        this.description = description;
        this.registerDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }
}

