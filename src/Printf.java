public class Printf {
    public static void main(String[] args) {

        /* printf() = is a method used to format output */
        /* %[flags][width][.precision][specifier-character] */

        String name = "Irfan";
        char firstLetter = 'I';
        int age = 29;
        double height = 168.2;
        boolean isEmployed = true;

        /* String -> %s */
        System.out.printf("Hello %s\n", name);
        /* Character -> %c */
        System.out.printf("Your name starts with an %c\n", firstLetter);
        /* int -> %d */
        System.out.printf("Your are %d years old\n", age);
        /* double -> %f */
        System.out.printf("Your are %f inches tall\n", height);
        /* boolean -> %b */
        System.out.printf("Employed: %b\n", isEmployed);

        /* combined */
        System.out.printf("%s is %d years old\n", name, age);


        /* precision */
        /* + = output a plus
        * , = comma grouping separator
        * ( = negative numbers are enclosed in ()
        * space = display a minus if negative, space if positive
        * */
        double price1 = 9000.99;
        double price2 = 10000.15;
        double price3 = -5400.01;

        System.out.printf("% .1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.3f\n", price3);


        /* [width]
        * 0 = zero padding
        * number = right justified padding
        * negative number = left justified padding */
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }
}