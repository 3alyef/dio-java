package com.exercicio.investigationQuestions;

import com.exercicio.investigationQuestions.Question.Question;
import com.exercicio.investigationQuestions.Question.Response;

public class InvestigationQuestions {

	public static void main(String[] args) {
		String[] questions = {
				"Telefonou para a vítima?", 
				"Esteve no local do crime?", 
				"Mora perto da vítima?", 
				"Devia para a vítima?",
				"Já trabalhou com a vítima?"
				};
		
		int yesNumber = 0;
		int noNumber = 0;
		
		for(String question: questions) {
			Question questionInput = new Question(question);
			questionInput.makeQuestion();
			Response resp = questionInput.getResponse();
			
			if(resp == Response.YES)yesNumber++;
		}
		
		if(yesNumber == 2) {
			System.out.println("Suspeita");
		} else if(yesNumber >= 3 || yesNumber <= 4) {
			System.out.println("Cúmplice");
		} else if(yesNumber == 5){
			System.out.println("Assassina");
		} else {
			System.out.println("Inocente");
		}

	}

}
