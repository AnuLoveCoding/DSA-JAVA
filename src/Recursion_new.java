import java.util.Scanner;

public class Recursion_new {
//    write a recursive function to solve the sum of numbers;
    public static int recursive_sum(int n){

        if (n == 1){

            return 1;

        }

        return recursive_sum(n - 1) + n;
    }

//    write a recursive function to solve the multiplication of numbers;
      public static int recursive_mul(int n){
        if(n == 1){
            return 1;
        }

        return recursive_mul(n - 1) * n;
      }

//      write a Recursive program find fibonnaci series;
    public static long recursive_series(long n){
        if(n == 1 || n == 0){
            return 1;
        }

        return recursive_series(n - 1) + recursive_series(n - 2);
    }

    public static void main(String[] args) {


//        print sum of n natural numbers in the number is given;

        Scanner input = new Scanner(System.in);

        long n = input.nextLong();

//      System.out.println(recursive_sum(n));

//      System.out.println(recursive_mul(n));

        System.out.println(recursive_series(n));

    }
}
