import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

     /* Random Object */

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double decimal;

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }

        decimal = random.nextDouble();

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(decimal);
        System.out.println(isHeads);
        System.out.println(number3);



    }
}