package com.zup.cqc.Repository;

import com.zup.cqc.Author.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
