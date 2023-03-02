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

    public static void transpose(int [][] arr1){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your arr size");
        int n = input.nextInt();

//        int [] arr = new int[n];
//
//        System.out.println("Enter your arr value ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }



//        Reverse the Array;
//        int i = 0;
//        int j = arr.length - 1;
//
//        while(i < j){
//
//            int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//
//             i++;
//             j--;
//        }
//
//        for (int k = 0; k < n; k++) {
//            System.out.print(arr[k] + " ");
//        }

//        print All the subarray;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k]+ " ");
//                }
//                System.out.println();
//            }
//        }

        int [][] arr1 = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = input.nextInt();
            }
        }


//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[0].length; j++) {
//                System.out.print(arr1[i][j]+ " ");
//            }
//            System.out.println();
//        }

//        Matrix Transpose;
//        Approach 1 this is Brute-Force solution.
//        int [][] arr2 = new int[n][n];
//
//        for (int j = 0; j < arr1[0].length; j++) {
//            for (int i = 0; i < arr1.length; i++) {
//                arr2[i][j] = arr1[i][j];
//            }
//        }

//      Matrix Transpose;
//      Approach 2 this is optimized solution.(### Here no need to take extra space for store the value);

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = arr1[i][j];
//                arr1[i][j] = arr1[j][i];
//                arr1[j][i] = temp;
//            }
//        }

//        transpose(arr1);

//        Rotate the 2D Matrix into 90 degree;

//        System.out.println(arr);

//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            System.out.print(arr[i]+" ");
//        }

//        add(arr);
//       max_arr(arr);
    }
}
