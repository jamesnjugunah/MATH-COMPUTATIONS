import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to our Circle Area Calculator!");
    System.out.print("Enter the radius of the circle: ");

    double radius = scanner.nextDouble();

    double area = CircleArea.calculateArea(radius);

    System.out.println("The area of the circle with radius " + radius + " is: " + area);

    scanner.close();
  }
}
