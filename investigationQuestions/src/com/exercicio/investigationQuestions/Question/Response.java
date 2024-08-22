package com.exercicio.investigationQuestions.Question;

public enum Response {
	YES, NO, UNDEFINED;

    public static Response fromString(String input) {
        switch (input.trim().toLowerCase()) {
            case "yes":
                return YES;
            case "y":
                return YES;
            case "ye":
                return YES;
            case "no":
                return NO;
            case "n":
                return NO;
            default:
                return UNDEFINED;
        }
    }
}
