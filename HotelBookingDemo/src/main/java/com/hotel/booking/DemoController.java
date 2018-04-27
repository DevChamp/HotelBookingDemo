package com.hotel.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping
	@RequestMapping("/demo1")
	public String demo1() {
		return "demo1";
	}
	
	@GetMapping
	@RequestMapping("/demo2")
	public String demo2() {
		return "demo2";
	}
}
