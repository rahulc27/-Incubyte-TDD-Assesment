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
	public void testEmptyString() {
		int addition = service.Add("");
		Assertions.assertEquals(0, addition);
		
		addition = service.Add(" ");
		Assertions.assertEquals(0, addition);
		
		addition = service.Add("  ");
		Assertions.assertEquals(0, addition);
	}
	
	@Test
	public void testSingleElement() {
		int addition = service.Add("1");
		Assertions.assertEquals(1, addition);
		
		addition = service.Add("2");
		Assertions.assertEquals(2, addition);
		
		addition = service.Add("3");
		Assertions.assertEquals(3, addition);
		
		addition = service.Add("200");
		Assertions.assertEquals(200, addition);
	}
	
	@Test
	public void testTwoElements() {
		int addition = service.Add("1,");
		Assertions.assertEquals(1, addition);
		
		addition = service.Add("5,2");
		Assertions.assertEquals(7, addition);
		
		addition = service.Add("10,20");
		Assertions.assertEquals(30, addition);
	}
	
	@Test
	public void testForUknownNumbersOfElement() {
		int addition = service.Add("1,2,3");
		Assertions.assertEquals(6, addition);
		
		addition = service.Add("1,2,");
		Assertions.assertEquals(3, addition);
		
		addition = service.Add("10,20");
		Assertions.assertEquals(30, addition);
		
		addition = service.Add("100,201");
		Assertions.assertEquals(301, addition);
	}
	
	@Test
	public void testNewLineininput() throws Exception{
		int addition = service.Add("1\n2,3");
		Assertions.assertEquals(6, addition);
	}

}
