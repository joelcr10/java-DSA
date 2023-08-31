package Recursion;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t>0){
            String code = inp.next();
            // check(code,"codechef");
            String ans = perm("","abc");
            System.out.println(ans);
            t--;
        }
    }

    static public String perm(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed); 
            // check(processed,unprocessed);
            return "123";
        }

        char ch = unprocessed.charAt(0);
        // System.out.println("processed: "+processed+"  unprocessed: "+unprocessed);
        for(int i=0;i<=processed.length();i++){
            String f = processed.substring(0, i);
            String s = processed.substring(i,processed.length());
            // System.out.println(f+","+ch+","+s);
            perm(f+ch+s,unprocessed.substring(1));

        }

        return "098";
    }

    static void check(String processed,String unprocessed){

    }
}
