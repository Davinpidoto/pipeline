package com.davdog.pipeline.controller

import com.davdog.pipeline.domain.Book
import com.davdog.pipeline.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class BookController {

  @Autowired
  BookRepository repository

  @GetMapping('/books')
  Iterable<Book> getBooks() {
    return repository.findAll()
  }

}
