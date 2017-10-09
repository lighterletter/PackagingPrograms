package com.lighterletter.javamaster;

import java.util.HashMap;

/**
 * Created by john on 10/7/17.
 */
public class Utils {

    static HashMap<String, String> getDefinitions() {
        HashMap<String, String> termsData; //global variable also called a "field"
        termsData = new HashMap<>();
        termsData.put("parameter", "Parameter: Input for a method");
        termsData.put("abstract", "Abstract: A keyword used in a class definition to show that the class is not to be instantiated");
        termsData.put("hashMap", "HashMap: A collection that accessed values through keys");
        termsData.put("array", "Array: A collection of data items");
        termsData.put("bit", "bit: smallest unit of information in a computer");
        termsData.put("object", "Object: The root class of Java!");
        return termsData;
    }
}
