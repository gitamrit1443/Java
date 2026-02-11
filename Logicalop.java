
// Logical operator in java is used to evaluate more than one condition
import java.util.Scanner;

public class Logicalop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter the temperature in farehiet");
        t = sc.nextInt();
        if (t <= 30 && t < 0)
            System.out.println("Weather is not good");
        else if (t > 30 && t > 0)
            System.out.println("Weather is good");
        else if (t > 30 || t != 0)
            System.out.println("Weather is good to play");
        else
            System.out.println("invalid temperature");
        sc.close();
        // to check all the condition then use if
    }
}