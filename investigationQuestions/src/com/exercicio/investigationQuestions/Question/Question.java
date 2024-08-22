package com.exercicio.investigationQuestions.Question;

import java.util.Scanner;

public class Question {
	private Response response;
	private String question;
	
	public Question(String question) {
		this.response = Response.UNDEFINED;
		this.question = question;
	}
	
	public Response getResponse() {
		return this.response;
	}
	
	public void makeQuestion() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(this.question + " y/n: ");
			String input = scanner.nextLine();
			
			this.response = Response.fromString(input);
			
			if(response != Response.UNDEFINED) {
				break;
			} else {
				System.out.println("Resposta inválida. Por favor, responda 'yes' ou 'no.'");
			}
		}
	}
}
