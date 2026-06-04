public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Original Value: " + a);

        System.out.println("Post Increment: " + (a++));
        System.out.println("Value After Post Increment: " + a);

        System.out.println("Pre Increment: " + (++a));

        System.out.println("Post Decrement: " + (a--));
        System.out.println("Value After Post Decrement: " + a);

        System.out.println("Pre Decrement: " + (--a));
    }
}