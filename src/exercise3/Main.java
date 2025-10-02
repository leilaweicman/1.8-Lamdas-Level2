package exercise3;

public class Main {

    public static void main(String[] args) {

        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Addition: " + addition.operation(10, 5));
        System.out.println("Subtraction: " + subtraction.operation(10, 5));
        System.out.println("Multiplication: " + multiplication.operation(10, 5));
        System.out.println("Division: " + division.operation(10, 5));
    }
}
