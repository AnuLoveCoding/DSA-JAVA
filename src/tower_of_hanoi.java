import java.util.*;

public class tower_of_hanoi {
    static ArrayList<ArrayList<Integer>> ans;

    public static void toh(int A , int from, int to, int aux){
        if(A == 0){
            return;
        }

        toh(A - 1 , from, aux, to);

        ArrayList<Integer>ls = new ArrayList<>();

        ls.add(A);
        ls.add(from);
        ls.add(to);

        ans.add(ls);

        toh(A - 1, aux, to , from);

    }
    public static void tower_of_hanoi1(int A){
        ans = new ArrayList<ArrayList<Integer>>();

        toh(A , 1 , 3, 2);

        System.out.println(ans);
    }
    public static void main(String[] args) {

        int A = 3;

        tower_of_hanoi1(A);


    }
}
