package com.incubyte.Assesment;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.incubyte.Assesment.service.service;


@SpringBootTest
class AssesmentApplicationTests {
	
	@Autowired
	service service;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testForEmptyString() {
		int addition = service.Add("");
		Assertions.assertEquals(0, addition);
		
	}
	

}
