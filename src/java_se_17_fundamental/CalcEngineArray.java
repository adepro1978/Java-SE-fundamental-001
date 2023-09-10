package java_se_17_fundamental;

import java.util.Scanner;

public class CalcEngineArray {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Values you want to calculate: ");
//reading the number of elements we want to enter
        n = input.nextInt();
        //m = input.nextInt();
//creates an array in the memory of length 10
        int[] leftValue = new int[n];
        int[] rightValue = new int[n];
        System.out.println("Enter the Values separated with space: ");
        for (int i = 0; i < n; i++) {
//reading array elements from the user
            leftValue[i] = input.nextInt();
            rightValue[i] = input.nextInt();
            char[] oprCode = {'+', '-', '*', '/', '%'};
            int[] result = new int[n];


            switch (oprCode[i]) {

                // performs addition between numbers
                case '+':
                    result[i] = leftValue[i] + rightValue[i];
                    System.out.println(leftValue[i] + " + " + rightValue[i] + " = " + result[i]);
                    break;

                // performs subtraction between numbers
                case '-':
                    result[i] = leftValue[i] - rightValue[i];
                    System.out.println(leftValue[i] + " - " + rightValue[i] + " = " + result[i]);
                    break;

                // performs multiplication between numbers
                case '*':
                    result[i] = leftValue[i] * rightValue[i];
                    System.out.println(leftValue[i] + " * " + rightValue[i] + " = " + result[i]);
                    break;

                // performs division between numbers
                case '/':
                    result[i] = leftValue[i] / rightValue[i];
                    System.out.println(leftValue[i] + " / " + rightValue[i] + " = " + result[i]);
                    break;
                case '%':
                    result[i] = leftValue[i] % rightValue[i];
                    System.out.println(leftValue[i] + " % " + rightValue[i] + " = " + result[i]);
                    break;

                default:
                    System.out.print("Invalid operator!");
                    break;
            }
        }
    }
}
