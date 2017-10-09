package com.lighterletter.javamaster;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This program is a dictionary of Java terms.
 */
class JavaTrainer {

    private static HashMap<String, String> termsData; //global variable also called a "field"

    static void startJavaTrainer() {
        initializeMap();
        promptUser();
        startProgram();
    }

    private static void initializeMap() {
        termsData = new HashMap<>();
        termsData.put("parameter", "Parameter: Input for a method");
        termsData.put("abstract", "Abstract: A keyword used in a class definition to show that the class is not to be instantiated");
        termsData.put("hashMap", "HashMap: A collection that accessed values through keys");
        termsData.put("array", "Array: A collection of data items");
        termsData.put("bit", "bit: smallest unit of information in a computer");
        termsData.put("object", "Object: The root class of Java!");
    }

    private static void promptUser() {
        System.out.println("starting Java trainer! press 0 or type quit to quit");
        System.out.println();
        System.out.println("Welcome to Java-Trainer 1.0. Please enter a Java term you'd like to learn about!");
    }

    private static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String userTerm = scanner.next();

            if (userTerm.equals("quit") || userTerm.equals("0")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (termsData.containsKey(userTerm.toLowerCase())) {
                System.out.println("You typed: " + userTerm);
                System.out.println(termsData.get(userTerm));
                System.out.println("Please select another term ");
            } else {
                System.out.println("Term : \"" + userTerm + "\" not yet in database, would you like to add it? y/n?");
                String userAnswer = scanner.next();
                if (userAnswer.toLowerCase().equals("y")) {
                    //add to map
                    addNewTermToMap(scanner);
                    promptUser();
                } else {
                    System.out.println("would you like to quit?");
                    String answer = scanner.next();
                    if (answer.toLowerCase().equals("y")) {
                        break;
                    } else {
                        System.out.println("Restarting program!");
                        promptUser();
                    }
                }
            }
        }
    }

    private static void addNewTermToMap(Scanner scanner) {
        //This could use stronger error checking
        System.out.println("Enter a term: ");
        String key = scanner.next().toLowerCase();
        System.out.println("Enter a definition: ");
        scanner.nextLine(); // consumes end of line input after term
        String value = key + ": " + scanner.nextLine();
        termsData.put(key, value);
        System.out.println("term added to the dictionary");
        System.out.println();
    }
}
