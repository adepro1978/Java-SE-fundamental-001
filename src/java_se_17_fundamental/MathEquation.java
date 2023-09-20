package java_se_17_fundamental;

public class MathEquation {
    private final MathOperation opCode;
    private double result;
    private double leftVal;
    private double rightVal;



    public MathEquation(MathOperation opCode) {
        this.opCode = opCode;
    }

    public MathEquation(MathOperation opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }


    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }
    @Override
    public String toString(){
        char symbol = opCode.getSymbol();
        return leftVal +
                " " +
                symbol +
                " " +
                rightVal +
                " = " +
                result;
    }

    public double getResult() {
        return result;
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
    }
}