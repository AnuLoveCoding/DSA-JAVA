import java.util.*;

public class DSA_ARRAYLIST {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        Scanner input = new Scanner(System.in);

//        some function in ArrayList;

//        add
//        System.out.println("Enter your name please");
//        name.add(input.nextLine());
        name.add("Anjali");
        name.add("Taj-Mahal");
//        System.out.printf("This is my new experiment " + name);

//        add to index;
        name.add(1,"raj-shree");
        name.add(3,"ujjain");
//        System.out.println(name);


//        get;
//        System.out.println(name.get(2));
//        System.out.println(name.get(3));

//        set;
          name.set(2,"Akkash");
          name.set(1,"Amrit");

//          System.out.println(name);


//        size();

         System.out.println(name.size());

//        remove;
          name.remove(2);
          name. remove(0);

         System.out.println(name.size());
    }
}
