import java.util.Scanner;

public class power {
    public static void main(String[] args) {
//answer1
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no1=read.nextInt();
        System.out.println("Enter the power:");
        double pow1 =read.nextDouble();

        double result = Math.pow(no1, pow1);
        System.out.println(result);

//       **********************************
        //answer1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        double result1 = 1;

        for (int i = 0; i < power; i++) {
            result1 *= number;
            System.out.println(result1);
        }

    }
}