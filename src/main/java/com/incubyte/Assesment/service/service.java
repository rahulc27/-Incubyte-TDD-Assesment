package com.incubyte.Assesment.service;

import org.springframework.stereotype.Service;

@Service(value = "service")
public class service {
	
	public int Add(String numbers) {
		
		// If length of string is 0 after removing trailing and starting spaces return 0
		if (numbers.trim().length() == 0)
			return 0;
		
		//Create a string array after split the numbers string according to comma (",")
		String[] numbersList = numbers.split(",");
		
		//If length of string array is 1 then string contains only one element, simply returning numbersList first element after parsing it to Integer 
		if (numbersList.length == 1)
			return Integer.parseInt(numbersList[0]);
		
		int ans = 0;
		for (String num: numbersList) {
			ans = ans + Integer.parseInt(num);
		}
		
		return ans;
	}

}
