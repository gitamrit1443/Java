
// 
import java.util.Scanner;

public class Methods {
    public static void print() {
        System.out.println("This is a print function");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a;
        a = sc.nextInt();
        System.out.printf("the printed variable is:%d", a);

        sc.close();

    }
}
