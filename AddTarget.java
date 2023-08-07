public class AddTarget {
    public static void main(String[] args) {

        int [] numbers ={2,7,11,15};
        int target =9;
        for (int i=0; i<=numbers.length-1; i++){
            for  (int j=i+1; j<=numbers.length-1; j++){
              if (numbers[i] + numbers[j]==target){
                  System.out.println(i +" "+ j);
              }

              }

            }
        }
    }

