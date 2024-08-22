package com.exercicio.temperatureProject.temperature;

import java.time.Month;

public class Temperature {
	private float temperature;
	private Month mes;
	public Temperature(float temperature, Month mes) {
		this.temperature = temperature;
		this.mes = mes;
	}
	
	public float getTemperature() {
		return this.temperature;
	}
	
	public Month getMes() {
		return this.mes;
	}
}
