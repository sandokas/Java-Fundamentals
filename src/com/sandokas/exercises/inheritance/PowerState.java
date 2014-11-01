package com.sandokas.exercises.inheritance;

public enum PowerState {
	ON("Turn on"),
	OFF("Turn off"),
	SUSPEND("Suspend");
		
	private String _description;
	private PowerState (String description) {
		_description = description;
	}
	public String getDescription() {
		return _description;
	}
}
