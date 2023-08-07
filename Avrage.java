import java.util.Scanner;

public class Avrage {
    public static void main(String[] args) {
        //Average
        Scanner Avg = new Scanner(System.in);
        System.out.println("Enter number1:");
        double num1 = Avg.nextDouble();
        System.out.println("Enter number2:");
        double num2 = Avg.nextDouble();
        System.out.println("Enter number3:");
        double num3 = Avg.nextDouble();
        System.out.println("Average = " + (num1 + num2 + num3) / 3);

    }
}

