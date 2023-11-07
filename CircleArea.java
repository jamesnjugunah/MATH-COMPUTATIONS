public class CircleArea {
    public static double calculateArea(double radius) {
        //area of a circle is given by using the formula: A = π * r^2
        //π is approximately 3.14159, obtained from 22/7

        double approximatePi = 3.14159;
        double area = approximatePi * (radius * radius);
        return area;
    }
}
