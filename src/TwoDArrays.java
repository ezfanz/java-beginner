public class TwoDArrays {


    public static void main(String[] args) {

        /*
            2D array = An array where each element is an array Useful for storing
            a matrix of data
         */

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {{"apple", "orange", "banana"}, vegetables, meats};


        /* row and column */
        groceries[0][0] = "pineapple";
        groceries[1][2] = "celery";
        groceries[2][1] = "eggs";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");

            }
            System.out.println();

        }

        /* telephone keypad */

        char[] line1 = {'1', '2', '3'};
        char[] line2 = {'4', '5', '6'};
        char[] line3 = {'7', '8', '9'};
        char[] line4 = {'*', '0', '#'};

        char[][] telephone = {line1, line2, line3, line4};

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }


}