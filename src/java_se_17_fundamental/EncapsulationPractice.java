package java_se_17_fundamental;

public class EncapsulationPractice {


        // fields to calculate area
        int length;
        int breadth;

        // constructor to initialize values
        EncapsulationPractice(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        // method to calculate area
        public void getEncapsulationPractice() {
            int area = length * breadth;
            System.out.println("Area: " + area);
        }
    }