package com.incubyte.Assesment.service;

import org.springframework.stereotype.Service;

@Service(value = "service")
public class service {
	
	public int Add(String numbers) {
		if (numbers.trim().length() == 0)
			return 0;
		
		String[] numbersList = numbers.split(",");
		
		if (numbersList.length == 1)
			return Integer.parseInt(numbers);
		
		int num1 = Integer.parseInt(numbersList[0]);
		int num2 = Integer.parseInt(numbersList[1]);
		
		return num1 + num2;
	}

}
