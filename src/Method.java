public class Method {
    public static void main(String[] args) {

        /*
         method = a block of reusable code that is executed when called ()
         *
         */

        String name = "Nafri";
        int age = 17;

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up");
        }

        happyBirthday(name, age);

        System.out.println(cube(3));

        String fullName = getFullname("Irfan", "Zulkefly");
        System.out.println(fullName);


    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullname(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;

        } else {
            return false;
        }
    }

}