package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] fruitsArray = new String[size];
        for (int i = 0; i < size; i++ ){
            fruitsArray[i] = "apple";
        }
        return fruitsArray;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] fruitsList = new String[7];
        fruitsList[0] = "Apple";
        fruitsList[1] = "Banana";
        fruitsList[2] = "Cherry";
        fruitsList[3] = "Dragon fruit";
        fruitsList[4] = "Eggfruit";
        fruitsList[5] = "Fig";
        fruitsList[6] = "Grapes";

        String[] firstThreeElements = new String[3];

        for (int i = 0; i < 3; i++){
            firstThreeElements[i] = fruits[i];
        }
        return firstThreeElements;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> fruitsArrayList = new ArrayList<>();
        fruitsArrayList.add("apple");
        fruitsArrayList.add("banana");
        fruitsArrayList.add("cherry");
        fruitsArrayList.add("date");
        fruitsArrayList.add("elderberry");

        return fruitsArrayList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> listOfFruits = new ArrayList<>();

        listOfFruits.add(fruit1);
        listOfFruits.add(fruit2);
        listOfFruits.add(fruit3);

        return listOfFruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> fruitsList = new HashMap<String, String>();
        fruitsList.put("apple", "red");
        fruitsList.put("banana", "yellow");
        fruitsList.put("cherry", "red");
        fruitsList.put("date", "brown");
        fruitsList.put("elderberry", "black");

        return fruitsList;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        String apple = fruitMap.get("apple");
        return apple;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation

        HashSet<String> listUsingHashSet = new HashSet<String>();
        listUsingHashSet.add(fruit1);
        listUsingHashSet.add(fruit2);
        listUsingHashSet.add(fruit3);

        return listUsingHashSet;
    }

}
