package com.renz.MLSRealState;
/*
 * This is to demonstrate ArrayList
 * Jayson Mallari
 */
import java.util.Scanner;
import java.util.ArrayList;
public class MLSRealState {
	
	public static void main(String[] args){
		ArrayList<Property> mls = new ArrayList<Property>();
		
		Property p1 = new Property(200000,"land",3.50);
		mls.add(p1);
		p1 = new Property(300000,"estate",2.50);
		mls.add(p1);
		
		System.out.println("Listed : \n" + mls.toString());
		
	}

}
