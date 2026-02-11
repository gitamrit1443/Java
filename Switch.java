
// switch statement in java
// switch is a control flow statement that allows a variable to be tested for equality against a list of values. 
// Each value is called a case, and the variable being switched on is checked for each case.
// in java 14 new switch has come which reduce the time to add break in switch statement with using -> operator
import java.util.Scanner;

public class Switch {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int day;
        do {
            System.out.println("Enter the code 0,1,2,3,4,5,6,7 to display desired day and -1 for exiting ");
            day = sc.nextInt();
            switch (day) {
                case 0 -> System.out.println("Sunday");
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wenesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case -1 -> System.exit(day);
                default -> System.out.println("The code is not represent any day");
            }
        } while (day != -1);
        sc.close();

    }
}