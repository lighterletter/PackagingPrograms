package com.lighterletter.lists;

import com.lighterletter.animals.dogs.Dog;

/**
 * Created by john on 9/30/17.
 */
public class NList {

    public static void main(String[] args) {
        MyList<String> light = new MyList("hello!", 5, 5, 5, 3, 3, 23, 4,new Dog("fido"));
        light.add("meow!!");
        for (int i = 0; i < 10; i++) {
            light.add(String.valueOf(i));
        }


        MyList m = new MyList();


        m.print();
//        light.print();

    }
}
