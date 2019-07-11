package com.codingdojo;


public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ringer = getRingTone();
		return ringer;
    }
    @Override
    public String unlock() {
		return "Unlocked via finger print.";
    }
    @Override
    public void displayInfo() {
    	System.out.println("Iphone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery.");          
    }
}