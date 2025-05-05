public class ToString {
    public static void main(String[] args) {

     /* .toString() = Method inherited from the object class.
     *                Used to return a string representation of an object
     *                By default, it returns a hash code as a unique identifier
     *                It can be overridden to provide meaningful details.
     *
     *  */

        Car car = new Car("Ford", "Mustang", 2026, "Red");
        Car car3 = new Car("Chevrolet", "Corvette", 2021, "Blue");

        System.out.println(car);
        System.out.println(car3);

    }
}