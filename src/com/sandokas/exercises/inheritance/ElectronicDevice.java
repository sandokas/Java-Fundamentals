package com.sandokas.exercises.inheritance;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class ElectronicDevice {
	private boolean isOn = false;
	private final String _manufacturer;
	public ElectronicDevice(String manufacturer) {
		_manufacturer = manufacturer;
	}
	
	public void changePowerState (PowerState s ) throws NotImplementedException
	{
		if (s == PowerState.ON) {
			isOn = true;
		} else if (s == PowerState.OFF) {
			isOn = false;
		} else {
			throw new NotImplementedException();
		}
		
	}
	
	public void turnOn() {
		if (!isOn)
			isOn = true;
	}
	public void turnOff() {
		if (isOn)
			isOn = false;		
	}
	public boolean getState() {
		return isOn;
	}
	public String getManufacturer() {
		return _manufacturer;
	}
	
}
