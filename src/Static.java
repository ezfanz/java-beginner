import java.lang.Math;

public class Static {
    public static void main(String[] args) {

        /* static = makes a variable or method belong to the class
         *           rather than to any specific object.
         *           Commonly used for utility methods or shared resources
         *  */

        Friend friend1 = new Friend("Irfan");
        Friend friend2 = new Friend("Alex");
        Friend friend3 = new Friend("Amira");
        Friend friend4 = new Friend("hello");

        Friend.showFriends();

        Math.round(3.99);

    }
}
