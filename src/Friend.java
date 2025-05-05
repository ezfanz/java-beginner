public class Friend {


    static int numOfFreinds;
    String name;

    Friend(String name){
        this.name = name;
        numOfFreinds++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFreinds + " total freinds");
    }

}
