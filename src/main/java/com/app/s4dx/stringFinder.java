package com.app.s4dx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringFinder {

    public String[] arrayOfstrings;

    public stringFinder(String[] arrayofstrings) {

        this.arrayOfstrings = arrayofstrings;
    }

    public List<String> find(String myStr) {
        final int strLenth = myStr.length();
        myStr = sortString(myStr);
        // arraylist contains the output
        List<String> result = new ArrayList<String>();
        for (String s : this.arrayOfstrings) {
            if (strLenth == s.length()) {

                if (myStr.equals(sortString(s))) {
                    result.add(s);
                }
            }

        }
        return result;

    }
// transform the input string to lowercase string  and sort it from a..z
    public String sortString(String myStr) {
        myStr = myStr.toLowerCase();
        char[] chars = myStr.toCharArray();

        Arrays.sort(chars);
        return new String(chars);
    }

}
