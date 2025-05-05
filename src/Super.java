public class Super {


    public static void main(String[] args) {

        /*
            Super = Refers to the parent class (subclass <- superclass)
                    Used in constructors and method overriding
                    Calls the parent constructor to initialize attributes
         */

        Person person = new Person("Irfan", "Zulkefly");
        People student = new People("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        employee.showSalary();


    }


}