import java.lang.Math;
import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        /*
         * && = AND
         * || = OR
         * ! = NOT
         *  */

        double temp = -10;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is Sunny outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        } else if (temp > 30 || temp < 0) {
            System.out.println("the weather is bad");
        }

    }
}