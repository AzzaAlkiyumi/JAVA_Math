import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        //swap
        System.out.println("\n");
        Scanner swap = new Scanner(System.in);
        System.out.println("Enter x :");
        double x = swap.nextDouble();
        System.out.println("Enter y :");
        double y = swap.nextDouble();
        System.out.println("Before swaping" + x + "," + y);
        double z;
        z = x;
        x = y;
        y = z;
        System.out.println("After swaping" + x + "," + y);

    }
}
