package com.zup.cqc.Controller;

import com.zup.cqc.Author.Form.CreateAuthorForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("author")
public class AuthorController {

    @PostMapping
    public HttpResponse<?> createAuthor(@RequestBody @Valid CreateAuthorForm authorForm) {
        System.out.println(authorForm);
        return null;
    }

}
