import java.util.*;

public class Dsa_ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(15);
        num.add(98);
        num.add(55);
        num.add(17);
        num.add(18);
        num.add(19);
        System.out.println(num.size());

        for (int i = num.size() - 1; i >= 0; i--) {
            if(num.get(i) % 2 == 0){
                num.remove(i);
            }
        }

        System.out.println(num.size());
    }
}
