package java_se_17_fundamental;

import java.util.Scanner;

public class CalcEngineArrayAndMethod {

    static Scanner scan = new Scanner(System.in);

    // say method
    static void sayMessage(String msg) {
        System.out.println(msg);
    }
    //ask method for int with try and catch statement

    static int askUser(String prompt) {
        sayMessage(prompt);
        int n = -9999999;
        while (n == -9999999) {
            try {
                n = scan.nextInt();
            } catch (Exception e) {
                sayMessage("Your value was wrong, try again");
                scan.next();
            }
        }
        return n;

    }
    //method to ask with try and catch

    static double asked() {
        sayMessage("Input the Element to multiply with the main array : ");
        double n = -9999999;
        while (n == -9999999) {
            try {
                n = scan.nextDouble();
            } catch (Exception e) {
                sayMessage("Your value was wrong, try again");
                scan.next();
            }
        }
        return n;

    }

    //saying the arr method
    static void sayElements(double[] a) {

        for (double v : a) {
            //say each element
            sayMessage("" + v);
        }

    }

    //method for adding
    static void addElement(double[] a, double[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + b[i];

        }
        System.out.println("The Addition result is : ");
        sayElements(a);
    }

    //method that subtract
    static void subElements(double[] a, double[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] - b[i];

        }
        System.out.println("The Subtraction result is : ");
        sayElements(a);
    }

    //method that multiply
    static void multiplyElement(double[] a, double b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * b;
        }
        System.out.println("The multiplication result is");
        sayElements(a);
    }

    //fillArr method
    static double[] fillElement() {
        int size = askUser("");
        double[] b = new double[size];
        for (int i = 0; i < b.length; i++) {
            b[i] = askUser("Input the number");
        }

        return b;
    }
}