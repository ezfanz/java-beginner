public class Constructor {


    public static void main(String[] args) {

        /*
            Constructor = A special method to initialize objects you can pass arguments
            to a constructor and set up initial values
         */

        Student student1 = new Student("Irfan", 20, 3.2);
        Student student2 = new Student("amira", 23, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        student1.study();
        student2.study();
        student3.study();


    }


}