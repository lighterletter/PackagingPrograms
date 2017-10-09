package com.lighterletter.javamaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A quiz application for java questions.
 */
class JavaQuiz {

    static List<Question> questions;

    static void startJavaQuiz() {
        questions = buildMap();
        promptUser();
        initializeProgram();
    }

    private static List<Question> buildMap() {

        String[] answers1 = {"1: answer 1 ", "2: answer 2", "3: answer 3"};
        Question question1 = new Question(answers1, "Question 1", 2);

        String[] answers2 = {"1: answer 1", "2: answer 2", "3: answer 3"};
        Question question2 = new Question(answers2, "Question 2", 1);

        String[] answers3 = {"1: answer 1", "2: answer 2", "3: answer 3"};
        Question question3 = new Question(answers3, "Question 3", 3);

        List<Question> questionList = new ArrayList<>();

        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);

        return questionList;
    }

    private static void initializeProgram() {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        for (int i = 0; i < questions.size(); i++) {

            Question currentQuestion = questions.get(i);
            System.out.println(currentQuestion.getName());

            for (int j = 0; j < currentQuestion.getOptions().length; j++) {
                System.out.println(questions.get(i).getOptions()[j]);
            }

            //get user input
            int userChoice;
            String error = "Please type a number";
            try {
                userChoice = Integer.parseInt(scanner.next());

                // answer check
                if (userChoice == questions.get(i).getCorrectAnswer()) {
                    //correct answer
                    System.out.println("correct! ");
                    System.out.println();
                    correctAnswers++;
                } else {
                    //wrong answer
                    System.out.println("oops! Wrong answer :(");
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println(error);
                System.out.println();
                i--; // So that we reprint the question.
            }

        }

        System.out.println("Thanks for playing! Your final score was: " + correctAnswers + " out of: " + questions.size());
    }

    private static void promptUser() {
        System.out.println("Starting Java Quiz! press 0 or type quit to quit");
        System.out.println();
        System.out.println("Welcome to Java-Quiz 1.0. Please answer the following 3 questions correctly!");
    }

}
