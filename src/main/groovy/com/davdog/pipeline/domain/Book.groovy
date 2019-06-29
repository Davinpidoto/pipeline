package com.davdog.pipeline.domain

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class Book {

  @Id
  Long id
  String name
}
