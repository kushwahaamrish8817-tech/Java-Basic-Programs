public class ConditionalStatementsDemo {

    public static void main(String[] args) {

        // IF Statement
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        // IF-ELSE Statement
        int number = 7;

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // ELSE-IF Ladder
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // NESTED IF
        boolean hasIdCard = true;

        if (age >= 18) {
            if (hasIdCard) {
                System.out.println("Entry Allowed");
            }
        }
    }
}