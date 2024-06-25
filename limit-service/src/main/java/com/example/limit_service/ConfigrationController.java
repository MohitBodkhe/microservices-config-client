package com.example.limit_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigrationController {
	
	@Autowired
	private Configration configration;

	@GetMapping("/limits")
	public LimitCofigration limit() {
		return new LimitCofigration(configration.getMaximum(),configration.getMinimum());
	}
}
