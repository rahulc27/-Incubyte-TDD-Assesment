package com.incubyte.Assesment.service;

import org.springframework.stereotype.Service;

@Service(value = "service")
public class service {
	
	public int Add(String numbers) {
		
		// If length of string is 0 after removing trailing and starting spaces return 0
		if (numbers.trim().length() == 0)
			return 0;
		
		numbers = numbers.replace("\n", ",");
		//Create a string array after split the numbers string according to comma (",")
		String[] numbersList = numbers.split(",");
		
		int ans = 0;
		//Traverse numbersList array and add integer value of each element to the "ans" variable
		for (String num: numbersList) {
			ans = ans + Integer.parseInt(num.trim());
		}
		
		return ans;
	}

}
