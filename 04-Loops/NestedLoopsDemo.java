public class NestedLoopDemo {

    public static void main(String[] args) {

        // Square Pattern
        System.out.println("Square Pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right Triangle Pattern
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Multiplication Table (1 to 3)
        System.out.println("\nMultiplication Tables:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}