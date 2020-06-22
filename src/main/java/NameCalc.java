import java.util.Scanner;

public class NameCalc {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Output: " + result);
    }

    private static int getInt() {
        System.out.println("Input:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    private static char getOperation() {
        System.out.println("Operation:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("error when input");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            default:

                throw new RuntimeException("Операция не распознана. Повторите ввод.");
        }
        return result;
    }
}








