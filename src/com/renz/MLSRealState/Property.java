package com.renz.MLSRealState;

public class Property {
	private double askingPrice, lotSize;
	private int numBath, numBed;
	private String propertyType;
	
	public Property(double askingPrice, String propertyType, double lotSize ){
		this.askingPrice = askingPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		this.numBath = 0;
		this.numBed = 0;
	}
	
	public Property(double askingPrice, String propertyType, double lotSize, int numBath, int numBed ){
		this.askingPrice = askingPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		this.numBath = 0;
		this.numBed = 0;
	}
	
	public String toString(){
		return "\nYour Property" +
			"\nPrice: " + askingPrice +
			"\nType: " + propertyType +
			"\nSize: " + lotSize +
			"\nBathrooms: " + numBath +
			"\nBedrooms: " + numBed;
	}
}
