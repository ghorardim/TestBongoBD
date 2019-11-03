package problem1;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public static  boolean checkAnagram(String strFirst, String strSecond) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int strFirstLength = strFirst.length();
        int strSecondLength = strSecond.length();
        int n;
        if (strFirstLength != strSecondLength) {
            return false;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(String.valueOf(ch), 0);
        }
        for (int i = 0; i < strFirstLength; i++) {
            n = map.get(String.valueOf(strFirst.charAt(i)).toLowerCase());
            map.put(String.valueOf(strFirst.charAt(i)).toLowerCase(), n++);
            n = map.get(String.valueOf(strSecond.charAt(i)).toLowerCase());
            map.put(String.valueOf(strSecond.charAt(i)).toLowerCase(), n--);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (map.get(String.valueOf(ch)) != 0) {
                map.clear();
                return false;
            }
        }
        map.clear();
        return true;
    }

    public static void  unitTestAnagram() {
        String strFirst = "bleat";
        String strSecond = "Table";
        boolean output = true;
        if (Problem1.checkAnagram(strFirst, strSecond) == output) {
            System.out.println("OK...");
        } else {
            System.out.println("Wrong..");
        }
        strFirst = "eat";
        strSecond = "Ate";
        output = true;
        if (checkAnagram(strFirst, strSecond) == output) {
            System.out.println("OK...");
        } else {
            System.out.println("Wrong..");
        }
        strFirst = "abc";
        strSecond = "abcd";
        output = false;
        if (checkAnagram(strFirst, strSecond) == output) {
            System.out.println("OK...");
        } else {
            System.out.println("Wrong..");
        }
        strFirst = "aaa";
        strSecond = "aaa";
        output = true;
        if (checkAnagram(strFirst, strSecond) == output) {
            System.out.println("OK...");
        } else {
            System.out.println("Wrong..");
        }
        strFirst = "AAA";
        strSecond = "aaa";
        output = true;
        if (checkAnagram(strFirst, strSecond) == output) {
            System.out.println("OK...");
        } else {
            System.out.println("Wrong..");
        }
        strFirst = "aaAb";
        strSecond = "Baaa";
        output = true;
        if (checkAnagram(strFirst, strSecond) == output) {
            System.out.println("OK...");
        } else {
            System.out.println("Wrong..");
        }
    }

    public static void main(String[] args) {
        unitTestAnagram();
    }

}
