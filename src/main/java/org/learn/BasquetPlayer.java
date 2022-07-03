package org.learn;

import org.springframework.stereotype.Component;

@Component
public class BasquetPlayer implements Sportist{

	public String playSport() {
		return "I play basquet like Ginobili";
	}
	
}
