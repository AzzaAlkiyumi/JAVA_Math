import java.util.Scanner;
public class CircleArea {


        public static void main(String[] args) {

            //circle
            Scanner circle = new Scanner(System.in);
            System.out.println("Enter circle radius :");
            double r = circle.nextDouble();
            double PI = 3.14159;
            System.out.println("circle Area= " + (PI * Math.pow(r, 2)));
            System.out.println("circle Perimeter=" + 2 * PI * r);


    }
}
