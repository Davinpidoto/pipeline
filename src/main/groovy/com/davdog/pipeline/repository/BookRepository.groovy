package com.davdog.pipeline.repository

import com.davdog.pipeline.domain.Book
import org.springframework.data.repository.CrudRepository


interface BookRepository extends CrudRepository<Book, Long> {

}