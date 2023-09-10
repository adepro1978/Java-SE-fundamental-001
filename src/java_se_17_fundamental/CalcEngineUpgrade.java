package java_se_17_fundamental;

import java.util.Scanner;

public class CalcEngineUpgrade {

    public static void main(String[] args) {
        double num1, num2, result = 0;
        char opcode;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(" 1.  Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulus\n 0 exit");
            System.out.print("Select an option  : ");
            int n = input.nextInt();
            if (n <= 5) {

                if (n <= 0) {
                    System.out.print("You are signing out!\n");
                    break;
                } else {
                    System.out.print("Input first number : ");
                    num1 = input.nextDouble();
                    System.out.print("Input second number : ");
                    num2 = input.nextDouble();
                    
                    switch (n) {
                        case 1:
                            result = num1 + num2;
                            break;
                        case 2:
                            result = num1 - num2;
                            break;
                        case 3:
                            result = num1 * num2;
                            break;
                        case 4:
                            if (num2 > 0) {
                                result = num1 / num2;
                                // System.out.println("Result = " + result);
                            } else {
                                System.out.println("second number should not be 0");
                                result = 0;
                            }
                            break;
                        case 5:
                            result = num1 % num2;
                            break;

                        default:
                            System.out.print(" Invalid option!\n");
                            break;

                    }

                    System.out.println(" TOTAL ANSWER = " + result);

                }

            } else
                System.out.println(" INVALID OPTION PLEASE RETRY ");

            System.out.print("-----------------------------------------------\n");
        }
    }
}

