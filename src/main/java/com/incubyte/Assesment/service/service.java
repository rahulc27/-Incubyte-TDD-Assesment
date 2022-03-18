package com.incubyte.Assesment.service;

import java.util.ArrayList;
import java.util.List;

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
		boolean isnegative = false;
		List<Integer> negativeNumbers = new ArrayList<>();
		
		//Traverse numbersList array and add integer value of each element to the "ans" variable
		for (String num: numbersList) {
			int currNum = Integer.parseInt(num.trim());
			ans = ans + currNum;
			if(currNum < 0) {
				isnegative = true;
				negativeNumbers.add(currNum);
			}
		}
		
		if (isnegative)
			throw new Exception("negatives not allowed : "+ negativeNumbers.toString());
		
		return ans;
	}

}
