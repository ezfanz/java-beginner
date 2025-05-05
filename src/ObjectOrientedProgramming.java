import java.util.Random;
import java.util.Scanner;

public class ObjectOrientedProgramming {


    public static void main(String[] args) {

        /*
            Object = An entity that holds data (attribute)
            and can perform actions (methods)
            It is a reference data type
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);


    }


}