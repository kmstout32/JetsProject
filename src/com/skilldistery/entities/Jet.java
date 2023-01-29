package com.skilldistery.entities;

public abstract class Jet  {
	
	private String model;
	private double speed;
	private int range; 
	private long price; 
	private String speedInMach;
	//Jet constructor with String, double, int, and long in parameters
	public Jet() {}
	public Jet(String model, double speed, int range, long price) {
		this.model = model; 
		this.speed = speed; 
		this.range = range; 
		this.price = price; 
	
	}
	//All planes fly
	public abstract void fly();
	@Override
	public String toString() {
		return "Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price;
	}
	public String getSpeedInMach() {
//		this.speedInMach = speed * 0.001349;
		return speedInMach;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
