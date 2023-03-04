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
    public static long fibonaaci_series(long n){
        if(n == 1 || n == 0){
            return 1;
        }

        return fibonaaci_series(n - 1) + fibonaaci_series(n - 2);
    }
    
//    write a power functional program;
    public static long pow(int n , int b){
        
        if(b == 0){
            return 1;
        }
        
        long ans = pow(n, b/2);

        if(b % 2 == 1){ return (ans * ans * n); }

        return ans * ans;
    }

//    write a program to check String is palindrome or not;
    public static boolean palindrome(String name , int i, int j){
        if(i >= j){
            return true;
        }
        char ch = name.charAt(i);
        char ch1 = name.charAt(j);
        if(ch != ch1){
            return false;
        }
        return palindrome(name , i + 1, j - 1);
    }

    public static void main(String[] args) {


//        print sum of n natural numbers in the number is given;

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter Your base value : ");
//        int n = input.nextInt();

//        System.out.println("Enter your power value : ");
//        int b = input.nextInt();

//      System.out.println(recursive_sum(n));

//      System.out.println(recursive_mul(n));

//        System.out.println(fibonaaci_series(n));

//        System.out.println(pow(n,b));

        System.out.println("Enter your plaindrome name ");
        String name = input.next();

//        System.out.println(name.toCharArray());

        System.out.println(palindrome(name, 0 ,name.length() - 1));
    }
}
