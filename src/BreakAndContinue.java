public class BreakAndContinue {
    public static void main(String[] args) throws InterruptedException {
      /*
      break = break out of a loop (STOP)
      Continue = skip current iteration of a loop (SKIP)
       */

        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }

            System.out.print(i + " ");
        }

    }
}