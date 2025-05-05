public class MethodOverriding  {

    public static void main(String[] args){

    /* Method overriding = when a subclass provides its own
                implementation of a method that is already defined.
                Allows for code reusability and give specific implementations.
    * */

    Elephant elephant = new Elephant();
    Fox fox = new Fox();
    Bird bird = new Bird();

    elephant.move();
    fox.move();
    bird.move();

    }



}
