package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest() {

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        String actual = arrayParty.printArray(breakfast);

        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Mushrooms";

        String actual = arrayParty.lastElement(breakfast);

        Assert.assertEquals("only mushroom is printed", expected, actual);
    }


    @Test
    public void lastButOneTest() {

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Tomatoes";

        String actual = arrayParty.lastButOne(breakfast);

        //: Then
        Assert.assertEquals("only tomatoes is printed", expected, actual);

    }

    //TODO Define the method reverseTest
    @Test
    public void reverse() {

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";
        String actual = arrayParty.reverse(breakfast);
        Assert.assertEquals("reverse it", expected, actual);

    }

    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromeTest() {

        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayPalindrome = new ArrayParty();
        Assert.assertTrue(arrayPalindrome.isPalindrome(palindromic));
        Assert.assertFalse(arrayPalindrome.isPalindrome(breakfast));
    }

    //TODO Define the method compressTest
    @Test
    public void compressTest() {


        int[] nums = {1, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4};
        ArrayParty arrayCompress = new ArrayParty();
        String expected = "1\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "4";
        String actual = arrayCompress.compress(nums);

        Assert.assertEquals("only print one number, no repeats", expected, actual);

    }

    //TODO Define the method packTest
    @Test
    public void packTest() {

        char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd',
                'e', 'e', 'e', 'e'};
        ArrayParty arrayDuplicates = new ArrayParty();
        String expected = "aaaa, " + "b, " + "cc, " + "aa, " + "d, " + "eeee";
        String actual = arrayDuplicates.pack(letters);
        Assert.assertEquals("duplicates", expected, actual);

    }
}
