package com.siwoo.springbootudemy.repositories;

import com.siwoo.springbootudemy.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
