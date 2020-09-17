import java.util.Scanner;

public class InputData {

    public static String[] scanData() {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine().trim();
        if (!inputData.matches("(.*)\\s+(.*)\\s+(.*)")) {
            System.out.println("Вы ввели некоректные данные!");
            System.exit(1);
        }

        String[] ArrInputParam = inputData.split("\\s+");

        if (ArrInputParam.length > 3) {
            System.out.println("Вы ввели больше данных, чем может посчитать калькулятор!");
            System.exit(1);
        }

        return ArrInputParam;
    }

}
