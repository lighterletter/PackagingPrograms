package com.lighterletter.javamaster;

/**
 * Question object stores and provides correct fields for a Question Type.
 */

class Question {

    private String[] options;
    private String name;
    private int correctAnswer;

    Question(String[] options, String name, int correctAnswer) {
        this.options = options;
        this.name = name;
        this.correctAnswer = correctAnswer;
    }

    int getCorrectAnswer() {
        return correctAnswer;
    }

    String[] getOptions() {
        return options;
    }

    String getName() {
        return name;
    }
}
