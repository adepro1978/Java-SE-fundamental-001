package java_se_17_fundamental;

public enum MathOperation {

    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char symbol;

    public char getSymbol() {
        return symbol;
    }
    private MathOperation(char symbol) {
        this.symbol = symbol;
    }
}
