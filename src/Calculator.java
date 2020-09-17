public class Calculator {
    public static void main(String[] args) {
        String[] arrInput = InputData.scanData();

        String operator = arrInput[1];

        if (!TypeCheck.isCorrectOperator(operator)) {
            System.out.println("Вы ввели неверный оператор!");
            System.exit(1);
        }

        if (TypeCheck.isInt(arrInput[0]) && TypeCheck.isInt(arrInput[2])) {
            int a = TypeConversion.toIntFromString(arrInput[0]);
            int b = TypeConversion.toIntFromString(arrInput[2]);
            if (TypeCheck.isInRangeOneToTen(a) && TypeCheck.isInRangeOneToTen(b)) {
                int result = Calculation.getResult(a, b, operator);
                OutputData.printResult(Integer.toString(result));
            } else {
                System.out.println("Вы ввели числа не входящие в диапазон от 1 до 10!");
                System.exit(1);
            }
        } else if (
                TypeCheck.isInt(arrInput[0]) &&
                TypeCheck.isCorrectRoman(arrInput[2]) ||
                TypeCheck.isInt(arrInput[2]) &&
                TypeCheck.isCorrectRoman(arrInput[0])
        ) {
            System.out.println("Вы ввели числа в разных системах исчисления!");
            System.exit(1);
        } else if (TypeCheck.isCorrectRoman(arrInput[0]) && TypeCheck.isCorrectRoman(arrInput[2]))  {
            String num1 = arrInput[0];
            String num2 = arrInput[2];
            int bufA = TypeConversion.toArabicFromRoman(num1);
            int bufB = TypeConversion.toArabicFromRoman(num2);
            int bufResult = Calculation.getResult(bufA, bufB, operator);
            String result = TypeConversion.toRomanFromArabic(bufResult);
            OutputData.printResult(result);
        } else {
            System.out.println("Вы ввели не совсем корректные данные!!! Скорее всего вы ввели не целые числа!");
            System.exit(1);
        }
    }
}


