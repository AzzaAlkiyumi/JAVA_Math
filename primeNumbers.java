public class primeNumbers {
    public static void main(String[] args) {
        System.out.print("Prime Number from 1-100 : " );

        int n = 1;
        do {
            if (
                    n != 1 && n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0 || n == 2 || n == 3 || n == 5 || n == 7
            ) {
                System.out.print(" " +n);
            }
            n++;
        }
        while (n <= 100);
    }
}
