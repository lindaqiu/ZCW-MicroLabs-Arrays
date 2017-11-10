package io.zipcoder.microlabs.arrays;


import java.util.Arrays;
import java.util.Collections;

public class ArrayParty {

    public String printArray(String[] inputArray) {
        String output = "*** Output ***";

        for (String breakfastFood : inputArray) {
            output += "\n" + breakfastFood;
        }
        return output;
    }


    public String lastElement(String[] inputArray) {
        String output = "*** Output ***\n";
        output = output + inputArray[inputArray.length - 1];
        return output;
    }


    //TODO Define the method lastButOne

    public String lastButOne(String[] inputArray) {
        String output = "*** Output ***\n";
        output += inputArray[inputArray.length - 2];
        return output;
    }

    //TODO Define the method reverse

    public String reverse(String[] inputArray) {
        String output = "*** Output ***";
        Collections.reverse(Arrays.asList(inputArray));
        for (String breakfastFood : inputArray) {
            output = output + "\n" + breakfastFood;
        }
        return output;
    }

//    public String reverse(String[] inputArray) {
//         String output = "*** Output ***";
//         for (int i = inputArray.length-1; i>=0; i--) {
//                       output+="\n"+inputArray[i];
//          }
//         return output;
//         }

//TODO Define the method isPalindrome

    public boolean isPalindrome(String[] inputArray) {

        int endStartingPoint = inputArray.length - 1;
        boolean isAPalindrome = false;

        for (int i = 0; i <= endStartingPoint; i++) {
            if (inputArray[i].equals(inputArray[endStartingPoint]))

            {
                isAPalindrome = true;
                endStartingPoint--;
            } else {
                isAPalindrome = false;
                break;
            }
        }
        return isAPalindrome;
    }
    //TODO Define the method compress


    public String compress(int[] nums) {

        int previousInt = nums[0];
        int currentInt;
        String noRepeatNumbers = previousInt + "";
        int lengthOfArray = nums.length;

        for (int i = 1; i < lengthOfArray; i++) {
            currentInt = nums[i];

            if (currentInt != previousInt) {
                noRepeatNumbers = noRepeatNumbers + "\n" + currentInt;
                previousInt = currentInt;
            }
        }
        return noRepeatNumbers;
    }


//TODO Define the method pack

    public String pack(char[] letters) {

    char previousChar = letters[0];
    char currentChar;
    String repeatCharacters = previousChar + "";
    int lengthOfArray = letters.length;

    for(int i =1; i< lengthOfArray; i++){

        currentChar = letters[i];

        if(currentChar == previousChar){

            repeatCharacters = repeatCharacters +  currentChar;

        }
        else if(currentChar != previousChar){

            repeatCharacters = repeatCharacters + ", " + currentChar;
        }

        previousChar = currentChar;
    }
    return repeatCharacters;

    }


}




