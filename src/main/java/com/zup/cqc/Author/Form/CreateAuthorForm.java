package com.zup.cqc.Author.Form;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CreateAuthorForm {

    @NotBlank(message="Author name cannot be empty")
    private String name;

    @NotBlank(message="Author email cannot be empty")
    @Email(message="Invalid email format")
    private String email;

    @NotBlank(message="Author description cannot be empty")
    @Length(max=400)
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
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

    @Override
    public String toString() {
        return "CreateAuthorForm{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

