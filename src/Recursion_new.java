import java.util.Scanner;

public class Recursion_new {
//    write a recursive function to solve the sum of numbers;
    public static int recursive_sum(int n){

        if (n == 1){
            return 1;
        }

        return recursive_sum(n - 1) + n;

    }
    public static void main(String[] args) {


//        print sum of n natural numbers in the number is given;

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(recursive_sum(n));

    }
}
