package com.example.limit_service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class Configration {
	
	private int maxmimum;
	
	public int getMaximum() {
		return maxmimum;
	}

	public void setMaximum(int maximum) {
		this.maxmimum = maximum;
	}

	private int minimum;

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
