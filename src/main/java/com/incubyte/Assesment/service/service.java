package com.incubyte.Assesment.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;




@Service(value = "service")
public class service {
	
	public int Add(String numbers) throws Exception {
		
		String delimiter = ",";
		
		if (numbers.length() > 2 &&  numbers.trim().substring(0, 2).equals("//")){
			numbers = numbers.replace("//", "");
			delimiter = "" + numbers.trim().charAt(0);
			numbers = numbers.substring(2);
		}
		
		// If length of string is 0 after removing trailing and starting spaces return 0
		if (numbers.trim().length() == 0)
			return 0;
		
		numbers = numbers.replace("\n", delimiter);
		//Create a string array after split the numbers string according to comma (",")
		String[] numbersList = numbers.split(delimiter);
		
		int ans = 0;
		//Traverse numbersList array and add integer value of each element to the "ans" variable
		for (String num: numbersList) {
			ans = ans + Integer.parseInt(num.trim());
		}
		
		return ans;
	}

}
