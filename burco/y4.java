package burco;

public class y4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 0);  // This will cause an exception
        System.out.println("Result: " + result);
    }
}

