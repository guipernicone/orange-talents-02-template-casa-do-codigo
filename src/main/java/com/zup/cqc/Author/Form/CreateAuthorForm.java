package com.zup.cqc.Author.Form;

import com.zup.cqc.Author.Author;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CreateAuthorForm {

    @NotBlank(message="{NotBlank}")
    private String name;

    @Email(message="{Email}")
    private String email;

    @NotBlank
    @Length(max=400, message="{Length.description}")
    private String description;

    public CreateAuthorForm(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
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

    public Author toModel() {
        return new Author(
                this.getName(),
                this.getEmail(),
                this.getDescription()
        );
    }
    @Override
    public String toString() {
        return "CreateAuthorForm{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

