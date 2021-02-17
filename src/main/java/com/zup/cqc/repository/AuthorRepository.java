package com.zup.cqc.repository;

import com.zup.cqc.author.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
