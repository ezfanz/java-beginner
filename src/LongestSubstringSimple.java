public class LongestSubstringSimple {
    public static void main(String[] args) {



//        Problem : Find the Longest Substring Without Repeating Characters
//        Problem Statement: Given a string, find the length of the longest
//        substring without repeating characters. Implement a function that
//        takes a string as input and returns the length of the longest substring
//        without repeating characters.


        /* Function to check Longest Substring Without Repeating Characters */

        String result = lengthOfLongestSubString("pwwkew");
        System.out.println("The Input " + result);
        System.out.println("The Output " + result.length());

    }

    public static String lengthOfLongestSubString(String s) {
        String current = "";
        String longest = "";

        for (char c : s.toCharArray()) {
            if (current.contains(String.valueOf(c))) {
                current = current.substring(current.indexOf(c) + 1);
            }
            current += c;
            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        return longest;

    }
}