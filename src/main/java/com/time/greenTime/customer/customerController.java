package com.time.greenTime.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class customerController
{

	@GetMapping("/test")
	public String getDetails() {
		return "Hello...";
	}
}
