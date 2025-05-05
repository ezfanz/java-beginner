public class Car {

    String make = "Perodua";
    String model = "Axia";
    String color;
    int year = 2023;
    double price = 50000;
    boolean isRunning = false;


    Car(){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
