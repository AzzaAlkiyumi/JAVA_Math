import java.util.Random;
import java.util.Scanner;

public class gussGame {
    public static void main(String[] args) {

        Random random=new Random();

        int no=random.nextInt(100)+1;
        Scanner read =new Scanner(System.in);

        System.out.println("Guess number between 1 to 100");

        while(true) {
            int geussNo = read.nextInt();

            if (geussNo > no ) {
                System.out.println("Not correct!the number is less than number you insert");

            } else if (geussNo < no){
                System.out.println("Not correct!the number is greter than number you insert");

            }else  {
                System.out.println("Correct!" + no);
                break;
            }
        }System.exit(0);
    }

}