package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{	// 전기차

	private int batteryCapacity;	// 베터리 용량
	
	
	public Tesla() {}

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	// Car
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}
	
	
}
