import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {
        //declaration of variables
        Scanner scnr = new Scanner(System.in);
        double result = 0.0;
        double calcSum = 0;
        int calcNum = 0;
        double calcAvg = 0;
        double num1;
        double num2;
        String listMenu = "yes";
        //create endless loop
        while (0 == 0) {
            if (listMenu == "yes") {
                System.out.println("Current Result: " + result);
                System.out.println("\nCalculator Menu \n---------------\n0. Exit Program \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exponentiation \n6. Logarithm \n7. Display Average");
            }
            //asks for user selection
            System.out.println("Enter Menu Selection: ");
            int chosenOp = scnr.nextInt();
            if (chosenOp == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
                System.exit(0);
                listMenu = "yes";
            }
            //adds numbers
            if (chosenOp == 1) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 + num2;
                calcSum += result;
                calcNum++;
                listMenu = "yes";
            //subtracts num2 from num1
            } else if (chosenOp == 2) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 - num2;
                calcSum += result;
                calcNum++;
                listMenu = "yes";
            //multiplies numbers
            } else if (chosenOp == 3) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 * num2;
                calcSum += result;
                calcNum++;
                listMenu = "yes";
            //divides num1 by num2
            } else if (chosenOp == 4) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 / num2;
                calcSum += result;
                calcNum++;
                listMenu = "yes";
            //sets num1 to the power of num2
            } else if (chosenOp == 5) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = Exponentiate(num1, num2);
                calcSum += result;
                calcNum++;
                listMenu = "yes";
            //log with base of num1 and input of num2
            } else if (chosenOp == 6) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = Logarithimate(num1, num2);
                calcSum += result;
                calcNum++;
                listMenu = "yes";
            //displays stats
            } else if (chosenOp == 7) {
                double calcNumDouble = calcNum;
                if (calcNumDouble > 0) {
                    calcAvg = calcSum/calcNum;
                    int temporary = (int) (calcAvg * 100);
                    calcAvg = (double) temporary;
                    calcAvg = calcAvg/100;
                    System.out.println("Sum of calculations: " + calcSum);
                    System.out.println("Number of calculations: " + calcNum);
                    System.out.println("Average of calculations: " + calcAvg);
                } else {
                    System.out.println("Error: No calculations yet to average!");
                }
                listMenu = "no";
            //informs user of invalid choice if they did not choose 1-7
            } else {
                System.out.println("Error: Invalid selection!");
                listMenu = "no";
            }

        }

    }

    //num1 multiplies by itself exactly num2 times
    public static double Exponentiate(double num1, double num2) {
        double result = 0;
        double num1Copy = num1; //saves the original value of num1, the number being exponentiated
        if (num2 > 0) {
            for (int i = 1; i < (num2); i++) {
                num1 = num1 * num1Copy;
            }
            result = num1;
        }
        if (num2 == 0) {
            result = 1;
        }
        if (num2 < 0) {
            for (int i = -1; i > (num2); i--) {
                num1 = num1 * num1Copy;
            }
            result = 1 / num1;
        }
        return result;
    }

    //log function where different i numbers are tried until one works
    public static double Logarithimate(double num1, double num2) {
        double result = 0;
        for (double i = -(10000); i < 10000; i++) {
            if (Exponentiate(num1, i) == num2) {
                result = i;
                break;
            }
        }
        return result;
    }

}
