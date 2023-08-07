import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //calculator
        System.out.println("\n");
        Scanner calculator = new Scanner(System.in);
        while (true) {

            System.out.println("please enter number 1:");
            int no1 = calculator.nextInt();
            System.out.println("please enter number 2:");
            int no2 = calculator.nextInt();
            System.out.println("pleas chose an operation(+ ,-,*,/)");
            String operation = calculator.next();

            switch (operation) {
                case "+":
                    System.out.println("result =" + (no1 + no2));
                    break;
                case "-":
                    System.out.println("result =" + (no1 - no2));
                    break;
                case "*":
                    System.out.println("result =" + (no1 * no2));
                    break;
                case "/":
                    if (no2 == 0) {
                        System.out.println("you can not divide by zero ");
                    } else {
                        System.out.println("result =" + (no1 / no2));
                        break;
                    }
                default:
                    System.out.println("invalid!pleas chose an operation(+ ,-,*,/)");
                    break;
            }
            System.out.println("pleas write exit to quit or any other key to continue");
            String exit = calculator.next();
            if (exit.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
