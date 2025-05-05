import java.util.Arrays;

public class Array {

    static int x = 3;

    public static void main(String[] args) {

        /*
         array = a collection of values of the same data type
         think of it as a variable that can store more than 1 value
         *  for(String fruit : fruits ){
            System.out.println(fruit);
        }
         */

        /*array of value */
        String[] fruits = {"apple", "orange", "banana", "coconut"};

//        fruits[1] = "pineapple";
//         int numOfFruits = fruits.length;

        /* need to declare the index number */
//       for(int i =0; i < fruits.length; i++){
//           System.out.print(fruits[i] + " \n");
//       }

        /*sort array ascending order */
//        Arrays.sort(fruits);

        /*fill array  */
//        Arrays.fill(fruits, "pineapple");

       /* Enhance For loop (Foreach) */
        for(String fruit : fruits ){
            System.out.println(fruit);
        }

    }

}