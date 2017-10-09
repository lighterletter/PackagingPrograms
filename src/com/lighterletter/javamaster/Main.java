package com.lighterletter.javamaster;


import java.util.Scanner;

/**
 * This is Java master, a program that will help you train to become a Java developer.
 * In this program we explore two types of training:
 * <p>
 * 1: An interactive Java terminology game called Java-Trainer
 * 2: A Java Question type mini-game called Java-Quiz
 *
 * @see JavaTrainer
 * @see JavaQuiz
 */

public class Main {

    public static void main(String[] args) {
        promptUser();
        Scanner scanner = new Scanner(System.in);
        startProgram(scanner);
    }

    private static void startProgram(Scanner scanner) {
        while (scanner.hasNext()) {
            boolean quit = false;
            String error = "Please type a number.";

            try {
                int choice = Integer.parseInt(scanner.next());

                if (choice > 0 && choice <= 3) {
                    if (choice == 1) {
                        javaTrainer();
                        promptUser(); // user comes back
                    } else if (choice == 2) {
                        javaQuiz();
                        promptUser();

                    } else if (choice == 3) {
                        System.out.println("Thanks for playing, See you next time!");
                        quit = true;
                    }
                } else if (choice > 3 || choice < 1) {
                    System.out.println("please enter a valid number");
                    promptUser();
                } else {
                    continue;
                }

                if (quit) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println(error);
                promptUser();
            }
        }
    }

    //Option 1
    private static void javaTrainer() {
        System.out.println("selected Java-trainer!");
        JavaTrainer.startJavaTrainer();
        System.out.println();
        System.out.println("Welcome back to Java Master!");
    }

    //Option 2
    private static void javaQuiz() {
        System.out.println("selected Java-trainer!");
        JavaQuiz.startJavaQuiz();
        System.out.println();
        System.out.println("Welcome back to java master!");
    }

    private static void promptUser() {
        System.out.println();
        System.out.println("Welcome to JavaMaster 1.0. Please select one of the following..");
        System.out.println("1: Java-Trainer: Input a term for it's definition!");
        System.out.println("2: Java-Quiz: Answer 3 correct questions!");
        System.out.println("3: quit.");
    }
}
