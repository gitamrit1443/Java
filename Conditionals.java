import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		System.out.println("The number entered by your is:" + a);
		System.out.printf("The number entered by you is:%d\n", a);
		System.out.print("The number entered by your is:\n" + a);
		if (a < 0) {
			System.out.printf("The number is %d less than 0", a);
		} else if (a > 0) {
			System.out.printf("The number %d is greater than 0", a);

		} else {
			System.out.printf("The number %d is equal to zero", a);
		}
		sc.close();
	}
}
