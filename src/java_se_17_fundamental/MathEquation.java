package java_se_17_fundamental;

public class MathEquation {
    private static int numberOfCalculation;
    private static double sumOfResult;
    private MathOperation opCode;
    private double result;
    private double leftVal;
    private double rightVal;

    public MathEquation() {
    }

    public MathEquation(MathOperation opCode) {
        this.opCode = opCode;
    }

    public MathEquation(MathOperation opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public static double getAverageResult() {
        return sumOfResult / numberOfCalculation;
    }

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }
    public String toString(){
        char symbol = opCode.getSymbol();
        StringBuilder build = new StringBuilder(20);
        build.append(leftVal);
        build.append(" ");
        build.append(symbol);
        build.append(" ");
        build.append(rightVal);
        build.append(" = ");
        build.append(result);
        return build.toString();
    }

    /*public char symbolFromOpCode() {
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for (int index = 0; index < opCodes.length; index++) {
            if (opCode == opCodes[index]) {
                symbol = symbols[index];

            }

        }
        return symbol;
    }**/


    public double getResult() {
        return result;
    }


    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setOpCode(MathOperation opCode) {
        this.opCode = opCode;

    }

    void execute() {

        switch (opCode) {

            case ADD:
                result = leftVal + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                result = leftVal / rightVal;


                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opCode);
        }

        numberOfCalculation++;
        sumOfResult += result;

    }

}

