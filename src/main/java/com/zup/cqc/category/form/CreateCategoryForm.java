package com.zup.cqc.category.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zup.cqc.category.Category;
import com.zup.cqc.validator.UniqueValue;

import javax.validation.constraints.NotBlank;

public class CreateCategoryForm {
    @NotBlank(message = "{NotBlank}")
    @UniqueValue(fieldName = "name", domainClass = Category.class, message = "{UniqueValue}")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Category toModel(){
        return new Category(this.name);
    }

    @Override
    public String toString() {
        return "CreateCategoryForm{" +
                "name='" + name + '\'' +
                '}';
    }
}
