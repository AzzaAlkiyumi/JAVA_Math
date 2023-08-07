public class RmoveDuplcate {
    public static void main(String[] args) {

        int Array []={1,1,2,2,3,4,4,4,5};
        for (int i=0; i<Array.length; i++){
            for (int j=i+1; j<Array.length; j++){
                if (Array [i]==Array [j]) {
                    Array[i]=-1;

                }
            }

        }
        for (int i=0; i<Array.length; i++){
            if (Array [i]!=-1) {
                System.out.print(Array[i]);
            }
        }
    }
}