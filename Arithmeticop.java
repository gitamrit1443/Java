import java.util.Scanner;

public class Arithmeticop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the two numbers  a andb");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("The result of %d and %d is:%d\n", a, b, a + b);
		System.out.printf("The result of %d and %d is:%d\n", a, b, a * b);
		System.out.printf("The result of %d and %d is:%d\n", a, b, a - b);
		System.out.printf("The result of %d and %d is:%d\n", a, b, a / b);
		System.out.printf("The result of %d and %d is:%d\n", a, b, a % b);
		System.out.println("Values after updating a is:");
		a = 2;
		System.out.printf("The result of %d and %d is:%d\n", a, b, a++);
		System.out.printf("The result of %d and %d is:%d\n", a, b, ++a);
		System.out.println("The result of the expression is:" + (3 + 4 * (7 - 5) / 2));

		sc.close();

	}
}
