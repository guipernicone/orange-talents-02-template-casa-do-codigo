package com.zup.cqc.Controller;

import com.zup.cqc.Author.Author;
import com.zup.cqc.Author.Form.CreateAuthorForm;
import com.zup.cqc.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody @Valid CreateAuthorForm authorForm, UriComponentsBuilder uriBuilder) {

        Author author = authorForm.toModel();
        authorRepository.save(author);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(author.getId()).toUri();
        return ResponseEntity.created(uri).body(author);
    }

}
