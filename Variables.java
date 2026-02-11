import java.util.Scanner;

class Variables {
    public static void main(String[] argv) {
        // this is a single line comment
        /*
         * This
         * is
         * multiline
         * comment
         */
        System.out.println("Welcome to Ghost Programming");
        System.out.print("Back to Era\t");
        System.out.print("New Era");

        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("The Entered Number is" + num);
        sc.close();

    }
}