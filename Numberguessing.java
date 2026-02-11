import java.util.Random;

public class Numberguessing {
	public static void main(String[] args) {
		Random Num = new Random();
		int num = Num.nextInt(0, 6);
		System.out.println("The random number is:" + num);

	}
}
