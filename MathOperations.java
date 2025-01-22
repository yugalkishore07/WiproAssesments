package wiprobasics;

public class MathOperations {

    // Method with return type for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method without return type for addition
    public void addAndPrint(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    // Method with return type for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method without return type for subtraction
    public void subtractAndPrint(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    // Method with return type for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method without return type for multiplication
    public void multiplyAndPrint(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    // Method with return type for division
    public double divide(double a, double b) {
     
        return a / b;
    }

    // Method without return type for division
    public void divideAndPrint(double a, double b) {
        double result = a / b;
        System.out.println("Division: " + result);
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Using methods with return type
        int sum = math.add(10, 5);
        System.out.println("Sum (return type): " + sum);

        int difference = math.subtract(10, 5);
        System.out.println("Difference (return type): " + difference);

        int product = math.multiply(10, 5);
        System.out.println("Product (return type): " + product);

        double quotient = math.divide(10, 5);
        System.out.println("Quotient (return type): " + quotient);

        // Using methods without return type
        math.addAndPrint(10, 5);
        math.subtractAndPrint(10, 5);
        math.multiplyAndPrint(10, 5);
        math.divideAndPrint(10, 5);
    }
}

