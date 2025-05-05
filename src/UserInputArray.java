import java.util.Scanner;

public class UserInputArray {

    static int x = 3;

    public static void main(String[] args) {

        /*
            Assign array by length
         */

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i< foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

//        foods[0] = "pizza";
//        foods[1] = "taco";
//        foods[2] = "burger";

        for (String food: foods){
            System.out.println(food);
        }

        scanner.close();

//        System.out.println(foods.length);

    }

}