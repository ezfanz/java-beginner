import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // THIS IS MY FIRST JAVA PROGRAM

        /*
            This is a multi-line comment
         */

        String creator = "Irfan";

        System.out.println("Hello Im," + creator + " Welcome to my java for beginner");
        System.out.println("---------------------------------------");

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        // Primitive vs Reference
        // ---------    ---------
        // int          string
        // double       array
        // char         object
        // boolean

        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean forSale = false;
        boolean isOnline = true;

        String name = "Irfan Zulkefly";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String colour = "red";

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }


        Scanner scanner = new Scanner(System.in);

        /* Insert Your Name */
        System.out.print("Enter your name: ");
        String nickName = scanner.nextLine();


        /* Insert Your Age */
        System.out.print("Enter your age: ");
        int umur = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + nickName);
        System.out.println("You are " + umur + " years old");
        System.out.println("Your gpa is: " + gpa);
        if(isStudent){
            System.out.println("You are enrolled as a student");
        }else{
            System.out.println("You are NOT enrolled");
        }

        scanner.close();


    }
}