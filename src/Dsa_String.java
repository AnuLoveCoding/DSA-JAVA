import java.util.*;

public class Dsa_String {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

//        System.out.print("Enter your sentence please : ");
        String name = "This is my new car...";

//        StringBuilder bag = new StringBuilder();

//        Remove the vowels in Strings;

//        for (int i = 0; i <= name.length(); i++) {
//            char ch = name.charAt(i);
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//            }else{
//                bag.append(ch);
//            }
//        }

//        String ans = bag.toString();

//        System.out.printf("Remove vowels and find new sentence : " + ans);

//        reverse_vowels(name);

//        String s = "Scaler Academy";
//
//        System.out. println(s.substring(0,6));
//
//        String s1 = "one";
//
//        String s2 = s1.concat("two");
//
//        System.out.println(s2);

        System.out.println(remove_consecuttive("aaaabccc" , 4));
        
        

    }
//    Reverse the vowels in String and exchange them;
    public static void reverse_vowels(String name){
        char [] s = name.toCharArray();

        int i = 0;
        int j = s.length - 1;

        while(i < j){

            while (s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u' ){
                i++;
            }

            while (s[j] != 'a' && s[j] != 'e' && s[j] != 'i' && s[j] != 'o' && s[j] != 'u' ){
                j--;
            }

            if(i == j){
                break;
            }

            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;

            i++;
            j--;
        }

        for (char ch : s) {
            System.out.print(ch + " ");
        }

    }


//     remove consecutive char in a given String;
    public static String remove_consecuttive(String A , int B){

        String bag = "";

        int len  = A.length();

        int i = 0;
        int j;

        while(i < len){

            j = i;

            while(j < len && A.charAt(i) == A.charAt(j)){
                j++;
            }

            if(j - i == B){
                i = j;
            }else{
                bag += A.charAt(i);
                i++;
            }
        }

        return bag;
    }


}
