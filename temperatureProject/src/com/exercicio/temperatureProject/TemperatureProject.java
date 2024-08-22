package com.exercicio.temperatureProject;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.exercicio.temperatureProject.temperature.Temperature;

public class TemperatureProject {
	public static void main(String[] args) {
		List<Temperature> temperaturas = new ArrayList<Temperature>() {{
			add(new Temperature(40f, Month.JANUARY));
			add(new Temperature(28.5f, Month.FEBRUARY));
			add(new Temperature(5f, Month.MARCH));
			add(new Temperature(6.5f, Month.APRIL));
			add(new Temperature(8f, Month.MAY));
			add(new Temperature(7f, Month.JUNE));
			add(new Temperature(40f, Month.JULY));
			add(new Temperature(35.5f, Month.AUGUST));
			add(new Temperature(20f, Month.SEPTEMBER));
			add(new Temperature(25f, Month.OCTOBER));
			add(new Temperature(30f, Month.NOVEMBER));
			add(new Temperature(5f, Month.DECEMBER));
		}};
		
		double totalTemp = 0;
		
		for(Temperature temperature: temperaturas) {
			totalTemp += (double) temperature.getTemperature();
		}
		double mediaTemp = totalTemp/temperaturas.size();
		System.out.println("A media de temperatura é: "+mediaTemp);
		
		System.out.println("Os meses em que a temperatura ficou acima da media anual são: ");
		for (int i = 0; i < temperaturas.size(); i++) {
            Temperature temperature = temperaturas.get(i);
            if (temperature.getTemperature() > mediaTemp) {
                System.out.println((i + 1) + " - " + temperature.getMes());
            }
        }
	}
}
