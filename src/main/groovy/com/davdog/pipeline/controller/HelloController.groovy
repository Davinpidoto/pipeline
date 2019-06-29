package com.davdog.pipeline.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {

  @GetMapping('/')
  String sayHello() {
    return 'Hello'
  }

}
