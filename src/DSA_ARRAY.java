import java.util.*;

public class DSA_ARRAY {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your arr size");
        int n = input.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter your arr value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int j : arr) {
            System.out.print(j+ " ");
        }
    }
}
