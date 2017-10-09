package com.lighterletter.animals;

import com.lighterletter.animals.dogs.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] strings = new String[5];
        int n = strings.length; // num of elements in primitive array

        String string = "This is a string";
        string.length(); // num of chars in String object


        //Creating a map:
        HashMap<Integer, String> map = new HashMap<>(); // not used

        map.put(1,"Capricorn");
        map.put(2,"Aquarius");
        map.put(3,"Pisces");
        map.put(4,"Aries");
        map.put(5,"Taurus");
        map.put(6,"Gemini");
        map.put(7,"Cancer");
        map.put(8,"Leo");
        map.put(9,"Virgo");
        map.put(10,"Libra");
        map.put(11,"Scorpio");
        map.put(12,"Sagittarius");



        List<Dog> kevinsDogs = new ArrayList<>();
        kevinsDogs.add(new Dog("fido"));
        kevinsDogs.add(new Dog("clorox"));
        kevinsDogs.add(new Dog("dog"));
        kevinsDogs.add(new Dog("parce"));

        System.out.println("First list: ");
        for (int i = 0; i < kevinsDogs.size(); i++) {
            System.out.println(kevinsDogs.get(i).getName());
        }

        System.out.println();

        List<Dog> kathysDogs = new ArrayList<>();
        kathysDogs.add(new Dog("patrick"));
        kathysDogs.add(new Dog("spot"));
        kathysDogs.add(new Dog("jellybean"));
        kathysDogs.add(new Dog("fluffy"));

        System.out.println("second list: ");
        for (int i = 0; i < kathysDogs.size(); i++) {
            System.out.println(kathysDogs.get(i).getName());
        }

        System.out.println();

        HashMap<String, List<Dog>> data = new HashMap<>();
        data.put("Kevin", kevinsDogs);
        data.put("Kathy", kathysDogs);
        System.out.println("num of elements in hashmap: " + data.size());

        System.out.println();


        System.out.println("Kevin's Dogs: ");
        List<Dog> kevinsDawgs = data.get("Kevin");
        for (int i = 0; i < kevinsDawgs.size(); i++) {
            Dog kevinsDogAtI = kevinsDawgs.get(i);
            System.out.println(kevinsDogAtI.getName());
        }

        System.out.println();

        System.out.println("Kathy's Dogs: ");
        List<Dog> kathysDaws = data.get("Kathy");
        for (Dog dog : kathysDaws) {
            System.out.println(dog.getName());
        }

    }
}
