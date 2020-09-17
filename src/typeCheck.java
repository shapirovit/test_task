public class typeCheck {
    public static boolean isInt(String number) throws NumberFormatException {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInRangeOneToTen (int number) {
        return number <= 10 && number > 0;
    }

    public static boolean isCorrectRoman (String number) {
        return typeConversion.toArabicFromRoman(number) != -1;
    }

    public static boolean isCorrectOperator (String operator) {
        switch (operator) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }
}
