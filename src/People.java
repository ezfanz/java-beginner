public class People extends Person {

    double gpa;

    People(String first, String last, double gpa){
        super(first, last);
        this.last = last;
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "s gpa is: " + this.gpa);
    }
}
