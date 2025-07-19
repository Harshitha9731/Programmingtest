class Calculator {
    public void calculate(double a, double b, String operation) {
        if (operation.equals("add")) {
            System.out.println("Result: " + (a + b));
        } else if (operation.equals("subtract")) {
            System.out.println("Result: " + (a - b));
        } else if (operation.equals("multiply")) {
            System.out.println("Result: " + (a * b));
        } else if (operation.equals("divide")) {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double a = 10;
        double b = 20;
        String operation = "add"; 

        calc.calculate(a, b, operation);
    }
}
