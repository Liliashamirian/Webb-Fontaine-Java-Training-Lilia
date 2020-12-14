package week4;

import static week4.Constants.*;

/**
 * Created by Lilia Shamirian on  28, Nov, 2020
 */
public class StringAPI {
    //Ex1
    public String getIndexCharacter(String input, int k) {
        if (input == null || input.isEmpty()) {
            return OUT_OF_BOUND;
        }
        if (k < 0 || k > input.length()) {
            return OUT_OF_BOUND;
        }
        return String.valueOf(input.charAt(k));
    }

    //Ex2
    public int getWordCount(String input) {
        int count = 0;
        if (input == null || input.isEmpty()) {
            System.out.println(INVALID);
            return 0;
        }
        if (!(input.matches("(.*) (.*)"))) {
            System.out.println(" 1 Word ");
            return 0;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    //Ex3
    public String checkIfInputIsPalindrome(String input) {
        StringBuilder st = new StringBuilder(input);
        if (input == null || input.isEmpty()) {
            return OUT_OF_BOUND;
        }
        if (st.reverse().toString().equals(input)) {
            return PALINDROME;
        } else {
            return NOT_PALINDROME;
        }
    }

    //Ex4
    public String checkBrackets(String input) {
        if (input == null || input.isEmpty()) {
            return INVALID;
        }
        int length = input.length();
        if (length % 2 != 0) {
            return INVALID;
        }
        if (input.startsWith(")") || input.endsWith("(")) {
            return INVALID;
        }
        if (input.matches("[()]+")) {
            if (input.replace("(", "").length() == length / 2) {
                return VALID;
            }

        } else {
            return INVALID;
        }
        return INVALID;
    }

    //Ex5
    public boolean isInputContains(String input, CharSequence sequence) {
        if (input == null || sequence == null || input.isEmpty() || sequence.equals("")) {
            return false;
        }
        if (input.contains(sequence)) {
            return true;
        } else {
            return false;
        }
    }

    //Ex6
    public boolean isInputStartWithAnother(String orgString, String input) {
        if (orgString == null || input == null || orgString.isEmpty() || input.isEmpty()) {
            return false;
        }
        if (orgString.startsWith(input)) {
            return true;
        } else {
            return false;
        }
    }

    //Ex7
    public boolean isInputEndWithAnother(String orgString, String input) {
        if (orgString == null || input == null || orgString.isEmpty() || input.isEmpty()) {
            return false;
        }
        if (orgString.endsWith(input)) {
            return true;
        } else {
            return false;
        }
    }

    //Ex8
    public String removeDuplicateChars(String input) {
        if (input == null || input.isEmpty()) {
            return INVALID;
        }
        char[] arr1 = input.toCharArray();
        String orgString = "";
        for (char value : arr1) {
            if (orgString.indexOf(value) == -1) {
                orgString += value;
            }
        }
        return orgString;
    }

    //Ex9
    public String[] divideString(String input, int part) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        if (part < 0 || input.length() % part != 0) {
            return null;
        }
        int partSize = input.length() / part;
        String[] parts = new String[part];
        int index = 0;
        for (int i = 0; i < input.length(); i += partSize) {
            parts[index] = input.substring(i, i + partSize);
            index++;
        }
        return parts;
    }
}