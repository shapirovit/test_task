public class calculator {
    public static void main(String[] args) {
        String[] arrInput = inputData.scanData();

        String operator = arrInput[1];

        if (!typeCheck.isCorrectOperator(operator)) {
            System.out.println("Вы ввели неверный оператор!");
            System.exit(1);
        }

        if (typeCheck.isInt(arrInput[0]) && typeCheck.isInt(arrInput[2])) {
            int a = typeConversion.toIntFromString(arrInput[0]);
            int b = typeConversion.toIntFromString(arrInput[2]);
            if (typeCheck.isInRangeOneToTen(a) && typeCheck.isInRangeOneToTen(b)) {
                int result = calculation.getResult(a, b, operator);
                outputData.printResult(Integer.toString(result));
            } else {
                System.out.println("Вы ввели числа не входящие в диапазон от 1 до 10!");
                System.exit(1);
            }
        } else if (
                typeCheck.isInt(arrInput[0]) &&
                typeCheck.isCorrectRoman(arrInput[2]) ||
                typeCheck.isInt(arrInput[2]) &&
                typeCheck.isCorrectRoman(arrInput[0])
        ) {
            System.out.println("Вы ввели числа в разных системах исчисления!");
            System.exit(1);
        } else if (typeCheck.isCorrectRoman(arrInput[0]) && typeCheck.isCorrectRoman(arrInput[2]))  {
            String num1 = arrInput[0];
            String num2 = arrInput[2];
            int bufA = typeConversion.toArabicFromRoman(num1);
            int bufB = typeConversion.toArabicFromRoman(num2);
            int bufResult = calculation.getResult(bufA, bufB, operator);
            String result = typeConversion.toRomanFromArabic(bufResult);
            outputData.printResult(result);
        } else {
            System.out.println("Вы ввели не совсем корректные данные!!! Скорее всего вы ввели не целые числа!");
            System.exit(1);
        }
    }
}


