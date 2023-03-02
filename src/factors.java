import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int num = 10;

        int count = 0; // 2

//        for (int i = 1; i < num; i++) {
//            if(num % i == 0){
//                sum += i;
//            }
//        }
//
//        if(sum == num){
//            System.out.println("Yes it is factors : " + num);
//        }else{
//            System.out.println("No it is not factors : " + num);
//        }

//      This is prime function.
        for (int i = 1; i  <= num ; i++) {
            if(num % i == 0){
                count++;

            }
        }

        if(count == 2){
            System.out.println("This is prime number " + num);
        }else if (count == 1){
            System.out.println("This is co-prime  number " + num);
        }else{
            System.out.println("This is not prime number " + num);
        }


    }
}
