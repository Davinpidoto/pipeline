package com.davdog.pipeline

import com.davdog.pipeline.repository.BookRepository
import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class PipelineApplicationTests {

	@Autowired
	BookRepository bookRepository

	@Test
	void contextLoads() {
		bookRepository.findAll()
		Assertions.assertThat(1).isEqualTo(1)
	}

}
