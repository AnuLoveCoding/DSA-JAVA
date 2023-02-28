import java.util.*;

public class DSA_ARRAY {


    public static void add(int [] arr){
       int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        System.out.println("The arr sum is : " + sum);
    }

    public static void max_arr(int [] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("this is max arr is : "+ max);
        System.out.println("this is min arr is : "+min);
    }
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your arr size");
        int n = input.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter your arr value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]+" ");
        }

//        add(arr);
//       max_arr(arr);
    }
}
