package com.siwoo.springbootudemy.repositories;

import com.siwoo.springbootudemy.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
