public class calculation {

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
                result = calculation.sum(a, b);
                break;
            case "-":
                result = calculation.diff(a, b);
                break;
            case "*":
                result = calculation.multiply(a, b);
                break;
            case "/":
                result = calculation.division(a, b);
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }
}
