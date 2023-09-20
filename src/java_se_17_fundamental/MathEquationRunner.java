package java_se_17_fundamental;

import java.util.Scanner;


public class MathEquationRunner {
    public static void main(String[] args) {

        if (args.length == 0) {
             performCalculation();
            /* for (int i = 0; i < opCode.length; i++) {
             results[i] = execute(opCode[i], leftVal[i], rightVal[i]);

             }
             for (double currentResult : results)
             System.out.println(currentResult);
             } else if (args.length == 1 && args[0].equals("interact"))*/
        } else if (args.length == 3)

            handleCommandLine(args);
        else
            //System.out.println("provide an operation code and 2 numeric values");
            interactUser();
    }

    static void performCalculation() {
        mathEquation[] equations = new mathEquation[4];
        equations[0] = new mathEquation('d', 100.0d, 50.0d);
        equations[1] = new mathEquation('a', 25.0d, 92.0d);
        equations[2] = new mathEquation('s', 225.0d, 17.0d);
        equations[3] = new mathEquation('m', 11.0d, 3.0d);

        for (mathEquation equation : equations) {
            equation.execute();
            System.out.println(equation);
        }
        System.out.println("Average Result = " + mathEquation.getAverageResult());
        useOverloads();
    }

    static void useOverloads() {
        System.out.println();
        System.out.println("Using execute overloads");
        System.out.println();

        mathEquation equationOverload = new mathEquation('d');
        double leftDouble = 9.0;
        double rightDouble = 4.0;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overload result with double : " + equationOverload.getResult());

    }


    public static mathEquation create(char opCode, double leftVal, double rightVal) {
        mathEquation equation = new mathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
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
        mathEquation equation = new mathEquation(opCode, leftVal, rightVal);
        equation.execute();
        System.out.println(equation);
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