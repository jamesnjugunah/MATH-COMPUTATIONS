public class division {
    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // NaN represents an undefined nalue
        }
    }
}