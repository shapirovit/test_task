public class Calculation {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int getResult(int a, int b, String operator) {
        int result;
        switch(operator) {
            case "+":
                result = Calculation.sum(a, b);
                break;
            case "-":
                result = Calculation.diff(a, b);
                break;
            case "*":
                result = Calculation.multiply(a, b);
                break;
            case "/":
                result = Calculation.division(a, b);
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }
}
