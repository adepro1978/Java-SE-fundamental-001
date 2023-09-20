package java_se_17_fundamental;

import java.util.Scanner;

public class RunnerMathEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        if (args.length == 0)

            performCalculation();

        else if (args.length == 1 && args[0].equals("interact")) {

            while (true) {
                System.out.println("press 1 to perform operation or 2 to exit");
                option = scanner.nextInt();
                if (option == 1)
                    interactUser();
                else if (option==2)
                    break;
                else System.out.println("chose a valid option");
            }

        } else if (args.length == 3)

            performOperation(args);

        else
            System.out.println("provide an operation code and 2 numeric values");

    }

    static void performCalculation() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(MathOperation.DIVIDE, 100.0d, 50.0d);
        equations[1] = new MathEquation(MathOperation.ADD, 25.0d, 92.0d);
        equations[2] = new MathEquation(MathOperation.SUBTRACT, 225.0d, 17.0d);
        equations[3] = new MathEquation(MathOperation.MULTIPLY, 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println(equation);
        }
        System.out.println("Average Result = " + mathEquation.getAverageResult());
        useOverloads();
    }

    static void useOverloads() {
        System.out.println();
        MathEquation equationOverload = new MathEquation(MathOperation.DIVIDE);
        double leftDouble = 9.0;
        double rightDouble = 4.0;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overload result with double : " + equationOverload.getResult());

    }

    static void interactUser() {
        System.out.println("Enter an operation and two number");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);

    }

    private static void performOperation(String[] parts) {
        MathOperation opCode = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        MathEquation equation = new MathEquation(opCode, leftVal, rightVal);
        equation.execute();
        System.out.println(equation);
    }

    static double valueFromWord(String word) {
        String[] numberInWord = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        boolean isValueSet = false;
        double value = 0d;
        for (int index = 0; index < numberInWord.length; index++) {
            if (word.equals(numberInWord[index])) {
                value = index;
                isValueSet = true;
                break;
            }
        }
        if (!isValueSet) {
            value = Double.parseDouble(word);
        }
        return value;
    }
}