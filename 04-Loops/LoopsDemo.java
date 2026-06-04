public class LoopsDemo {

    public static void main(String[] args) {

        // FOR LOOP
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // BREAK STATEMENT
        System.out.println("\nBreak Statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        // CONTINUE STATEMENT
        System.out.println("\nContinue Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}