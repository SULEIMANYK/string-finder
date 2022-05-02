package com.app.s4dx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

class stringFinderTest {

    @Test
    void find() {
        String[] testArray = {"Ani", "Sam", " Joe"};
        stringFinder finder = new stringFinder(testArray);
        List<String> list1 = Arrays.asList("Sam");

        assertEquals(list1, finder.find("sma"));
    }

    // method to run 50000 instance of stringfinder with simple array of strings
    @Test
    void TestFinder50000instance() {
        String[] testArray = {"Ani", "Sam", " Joe"};
        for (int i = 0; i < 50000; i++) {

//            System.out.println("instance number " + i);

            stringFinder finder = new stringFinder(testArray);
            List<String> list1 = Arrays.asList("Sam");

            assertEquals(list1, finder.find("sma"));
        }
    }

    // call  method to run with array of 50000  string
    @Test
    void TestFinder50000() {
        testFinderbigarry(50000, "lxv");
    }

    // method to run with large init array
    void testFinderbigarry(int arrLength, String strToFind) {
        String[] testArray = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
            testArray[i] = randomAlphanumeric();
        }

        stringFinder finder = new stringFinder(testArray);
        System.out.println(finder.find(strToFind));
    }

    // method to generate rando string from a..z  and random length from 1..9 this will influnce the perfermonce we can create initial array of strings
    public String randomAlphanumeric() {
        Random random = new Random();
        int randomNum = random.nextInt((9 - 1) + 1) + 1;
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = randomNum;

        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();

    }

}