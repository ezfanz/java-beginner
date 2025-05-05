public class ConstructorArray {
    public static void main(String[] args) {

//        CarNew car1 = new CarNew("Mustang", "Red");
//        CarNew car2 = new CarNew("Corvette", "Blue");
//        CarNew car3 = new CarNew("Charger", "Yellow");

        CarNew[] cars = {new CarNew("Mustang", "Red"),
                        new CarNew("Myvi", "Cranberry"),
                        new CarNew("BMW", "Yellow")};

        for (CarNew car : cars) {
            car.color = "black";
        }

        for (CarNew car : cars) {
            car.drive();
        }
    }
}
