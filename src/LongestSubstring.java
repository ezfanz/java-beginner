import java.lang.Math;


public class LongestSubstring {
    public static void main(String[] args) {

        class longestSubstring {
            public static int lengthOfLongestSubstring(String s) {
                String current = "";
                int maxlength = 0;

                for (char c : s.toCharArray()) {
                    if (current.contains(String.valueOf(c))) {
                        current = current.substring(current.indexOf(c) + 1);
                    }
                    current += c;
                    maxlength = Math.max(maxlength, current.length());
                }
                return maxlength;
            }

            public static void main (String[] args){

                int result = lengthOfLongestSubstring("Irfan");
                System.out.println(lengthOfLongestSubstring("Longest substring length is: " + result));
//                System.out.println(lengthOfLongestSubstring("irfanZulkeflyyUiiiii"));
//                System.out.println(lengthOfLongestSubstring("irfanmalekkkk"));
            }

        }
    }
}

