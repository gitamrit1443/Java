import java.util.Scanner;

class Ternaryop {
    public static void main(String[] args) {
        // even odd and pass fail using ternary operator
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        int marks;
        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks = sc.nextInt();
        String res = (marks >= 30) ? "Pass" : "Fail";
        System.out.println("You are " + " " + res.toUpperCase());
        sc.close();
    }

}
