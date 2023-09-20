package java_se_17_fundamental;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CalcEngineWithString {
    public static void main(String @NotNull [] args) {
        double[] leftVal = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVal = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCode = {'d', 'a', 's', 'm'};
        double[] results = new double[opCode.length];
        if (args.length == 0) {
            for (int i = 0; i < opCode.length; i++) {
                results[i] = execute(opCode[i], leftVal[i], rightVal[i]);

            }
            for (double currentResult : results)
                System.out.println(currentResult);
        } else if (args.length == 1 && args[0].equals("interact"))
            interactUser();

        else if (args.length == 3)

            handleCommandLine(args);
        else
            System.out.println("provide an operation code and 2 numeric values");

    }

    static void interactUser() {
        System.out.println("Enter an operation and two number");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);

    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {

            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = leftVal / rightVal;


                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opCode);
        }
        return result;
    }

    static char opCodeFromString(String operationName) {
        return operationName.charAt(0);

    }

    static double valueFromWord(String word) {
        String[] numberInWord = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for (int index = 0; index < numberInWord.length; index++) {
            if (word.equals(numberInWord[index])) {
                value = index;
                break;
            }
        }
        return value;
    }
}
