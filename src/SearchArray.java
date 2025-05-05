import java.util.Scanner;

public class SearchArray {

    static int x = 3;

    public static void main(String[] args) {

        /*
            Search array
         */

        Scanner scanner = new Scanner(System.in);


        int[] numbers = {1, 9, 5, 4, 3, 2, 0};
        int targetNumber = 9;
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");

        target = scanner.nextLine();

        /*Linear Search */
//        for(int i = 0; i < numbers.length; i++){
//            if(targetNumber == numbers[i]){
//                System.out.println("Element Numbers found at index " + i);
//                isFound = true;
//                break;
//            }
//        }

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element Fruits found at index " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }

        scanner.close();

    }

}