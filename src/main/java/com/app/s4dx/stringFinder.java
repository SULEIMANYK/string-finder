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

    public String sortString(String myStr) {
        myStr = myStr.toLowerCase();
        char[] chars = myStr.toCharArray();

        Arrays.sort(chars);
        return new String(chars);
    }

}
