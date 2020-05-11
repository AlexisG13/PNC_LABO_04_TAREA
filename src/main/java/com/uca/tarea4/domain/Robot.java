package com.uca.tarea4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	@AssertTrue(message = "No puedes agregar tu producto porque eres un robot")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}

}
