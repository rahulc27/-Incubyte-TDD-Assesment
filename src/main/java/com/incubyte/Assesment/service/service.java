package com.incubyte.Assesment.service;

import org.springframework.stereotype.Service;

@Service(value = "service")
public class service {
	
	public int Add(String numbers) {
		if (numbers.trim().length() == 0)
			return 0;
		
		return Integer.parseInt(numbers);
	}

}
