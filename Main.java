import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Multiplication product = new Multiplication();
    Addition sum =new Addition();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to our Circle Area Calculator!");
    System.out.print("Enter the radius of the circle: ");

    double radius = scanner.nextDouble();

    double area = CircleArea.calculateArea(radius);

    System.out.println("The area of the circle with radius " + radius + " is: " + area);

    System.out.println("Enter  your first operand");
    double num1 = scanner.nextDouble();
    System.out.println("Enter  your operator");
    String operator = scanner.nextLine();
    System.out.println("Enter  your second operand");
    double num2 = scanner.nextDouble();
    switch (operator) {
      case "*":
        double result = product.multiply(12, 12);
        System.out.println(result);
        break;
      default:
        System.out.println("invalid operator");
        break;


    }
    scanner.close();
  }
}
