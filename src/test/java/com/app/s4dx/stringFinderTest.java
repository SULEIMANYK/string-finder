package com.app.s4dx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.Test;

class stringFinderTest {

    @Test
    void find() {
        String[] testArray = { "Ani", "Sam", " Joe" };
        stringFinder finder = new stringFinder(testArray);
        List<String> list1 = Arrays.asList("Sam");

        assertEquals(list1, finder.find("sma"));
    }
    @Test
    void TestFinder50000instance() {
        String[] testArray = { "Ani", "Sam", " Joe" };
        for (int i = 0; i < 50000; i++) {

        stringFinder finder = new stringFinder(testArray);
        List<String> list1 = Arrays.asList("Sam");

        assertEquals(list1, finder.find("sma"));}
    }
    @Test
    void TestFinder50000() {
        testFinderbigarry(50000);
    }

    void testFinderbigarry(int arrLength) {
        String[] testArray = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
            testArray[i] = randomAlphanumeric();
        }

        stringFinder finder = new stringFinder(testArray);
        System.out.println(finder.find("lwz"));
    }

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