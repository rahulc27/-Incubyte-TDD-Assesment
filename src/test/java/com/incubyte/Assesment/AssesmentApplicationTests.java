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
	public void testEmptyString() throws Exception{
		int addition = service.Add("");
		Assertions.assertEquals(0, addition);
		
		addition = service.Add(" ");
		Assertions.assertEquals(0, addition);
		
		addition = service.Add("  ");
		Assertions.assertEquals(0, addition);
	}
	
	@Test
	public void testSingleElement() throws Exception {
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
	public void testTwoElements() throws Exception{
		int addition = service.Add("1,");
		Assertions.assertEquals(1, addition);
		
		addition = service.Add("5,2");
		Assertions.assertEquals(7, addition);
		
		addition = service.Add("10,20");
		Assertions.assertEquals(30, addition);
	}
	
	@Test
	public void testForUknownNumbersOfElement() throws Exception{
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
		
		addition = service.Add("1\n 2,3");
		Assertions.assertEquals(6, addition);
		
		addition = service.Add("1\n 2,3\n5, 202");
		Assertions.assertEquals(213, addition);
	}
	
	@Test
	public void testDelimiter() throws Exception{
		int addition = service.Add("//;\n1;2");
		Assertions.assertEquals(3, addition);
		
		addition = service.Add("//;\n1");
		Assertions.assertEquals(1, addition);
		
		addition = service.Add("//;\n");
		Assertions.assertEquals(0, addition);
		
	}
	
	@Test
	public void testNegativenumbers() throws Exception {
		Exception exception = Assertions.assertThrows(Exception.class, () -> service.Add("//;\n-11;2") );
		Assertions.assertEquals("negatives not allowed : -11", exception.getMessage());
	}

}
