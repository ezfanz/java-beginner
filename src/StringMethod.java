public class StringMethod {
    public static void main(String[] args) {

        /*
         * String Method */

            String name = "Irfan";

            int length = name.length();
            char letter = name.charAt(0);
            int index = name.indexOf("f");
            int lastIndex = name.lastIndexOf("n");

            //name = name.toUpperCase();
            //name = name.toLowerCase();
            //name = name.trim();
            //name = name.replace("I", "A");

            /*
            if(name.isEmpty()){
                System.out.println("Your name is empty");
            }else{
                System.out.printf("Hello %s\n", name);
            }
            */

        /*
            if(name.contains(" ")){
                System.out.println("Your name contains a space");
            }else{
                System.out.println("Your name DOESN'T contain any spaces");
            }
        */

        if(name.equalsIgnoreCase("Irfan")){
            System.out.println("Your name can't be Irfan");
        }else{
            System.out.printf("Hello %s\n", name);
        }

    }
}