import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
    //rectangle
    Scanner rectangle = new Scanner(System.in);
        System.out.println("Enter rectangle high :");
    double h = rectangle.nextDouble();
        System.out.println("Enter rectangle width :");
    double w = rectangle.nextDouble();
        System.out.println("rectangle Perimeter= " + (h + w) * 2);
        System.out.println("rectangle Area=" + h * w);
}}
