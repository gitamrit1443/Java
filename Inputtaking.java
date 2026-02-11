import java.util.Scanner;

class Inputtaking {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int age;
      String name;
      System.out.println("Enter the age of the student");
      age = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Enter your name");
      name = scanner.nextLine();
      System.out.printf("Your age is:%d and your name is : %s", age, name);
      scanner.close();
      // it is a problem here next line is taken as a new line as a character string
      // to resolve this issue we use an extra next line method
      // scanner.nextLine();
   }
}