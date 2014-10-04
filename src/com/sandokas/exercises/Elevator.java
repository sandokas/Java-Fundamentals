package com.sandokas.exercises;



public class Elevator  {
	private boolean doorOpen = false;
	private int currentFloor = 1;
	private final int MIN_FLOOR;
	private final int TOP_FLOOR;
	
	public Elevator(int minimumFloor, int maximumFloor) throws Exception
	{
		if (minimumFloor >= maximumFloor) {
			throw new Exception("minimumFloor should be < maximumFloor");
		}
		MIN_FLOOR = minimumFloor;
		TOP_FLOOR = maximumFloor;
		currentFloor = MIN_FLOOR;
	}
	
	public Elevator() throws Exception
	{
		this(1, 10);
	}
	
	public Elevator(int minimumFloor, int maximumFloor, boolean isDoorOpen) throws Exception {
		this(minimumFloor, maximumFloor);
		doorOpen = isDoorOpen;
	}
	
	public void goUp() throws NotImplementedException {
		throw new NotImplementedException();
	}
	
	public void goDown() throws NotImplementedException {
		throw new NotImplementedException();
	}
	
	public int getCurrentFloor () 
	{
		return currentFloor;
	}
	public boolean getDoorOpen() {
		return doorOpen;
	}
	
}
