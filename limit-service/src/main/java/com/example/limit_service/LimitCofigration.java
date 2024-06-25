package com.example.limit_service;

public class LimitCofigration {
	int maximum;
	int minium;
	public LimitCofigration() {
		
	}
	
	public LimitCofigration(int maximum, int minium) {
		super();
		this.maximum = maximum;
		this.minium = minium;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinium() {
		return minium;
	}
	public void setMinium(int minium) {
		this.minium = minium;
	}

}
