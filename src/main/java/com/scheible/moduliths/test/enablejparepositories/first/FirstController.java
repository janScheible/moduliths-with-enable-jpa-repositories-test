package com.scheible.moduliths.test.enablejparepositories.first;

import com.scheible.moduliths.test.enablejparepositories.second.SecondRepository;
import org.springframework.stereotype.Controller;

@Controller
public class FirstController {
	
	private final FirstRepository firstRepository;
	private final SecondRepository secondRepository;

	public FirstController(FirstRepository firstRepository, SecondRepository secondRepository) {
		this.firstRepository = firstRepository;
		this.secondRepository = secondRepository;
	}
}
