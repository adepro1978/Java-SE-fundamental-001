package java_se_17_fundamental;

public class CalcEngine_CommandLine_Arg {
    public static void main(String[] args) {
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

        } else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("provide an operaton code and 2 number values");

    }

    static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result = 0;
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


        }
        return result;
    }
}