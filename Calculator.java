
// create a calculator using switch and dowhile loops
import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        if (a > b)
            return a - b;
        return (b - a);
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, op1, op2;
        do {
            System.out.println(
                    "Enter the choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n0 for exiting");
            choice = sc.nextInt();
            System.out.println("Enter the two operands for operation");
            op1 = sc.nextInt();
            op2 = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    int res = add(op1, op2);
                    System.out.println("The result of operation is:" + res);
                }
                case 2 -> {
                    int res = sub(op1, op2);
                    System.out.println("The result of operation is:" + res);
                }
                case 3 -> {
                    int res = mul(op1, op2);
                    System.out.println("The result of operation is:" + res);
                }
                case 4 -> {
                    int res = div(op1, op2);
                    System.out.println("The result of operation is:" + res);
                }
                case -1 -> System.out.println("Invalid option");
                default -> System.out.println("Not included in option");
            }
        } while (choice != 0);

        sc.close();
    }
}
