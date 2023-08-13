package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        perm("","abc");
        ArrayList<String> res = permList("","abcd");
        System.out.println(res);
        
    }

    static void perm(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        System.out.println("processed: "+processed+"  unprocessed: "+unprocessed);
        for(int i=0;i<=processed.length();i++){
            String f = processed.substring(0, i);
            String s = processed.substring(i,processed.length());
            System.out.println(f+","+ch+","+s);
            perm(f+ch+s,unprocessed.substring(1));

        }
    }

    static ArrayList<String> permList(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = unprocessed.charAt(0);
        System.out.println("processed: "+processed+"  unprocessed: "+unprocessed);
        for(int i=0;i<=processed.length();i++){
            String f = processed.substring(0, i);
            String s = processed.substring(i,processed.length());
            System.out.println(f+","+ch+","+s);
            ans.addAll(permList(f+ch+s,unprocessed.substring(1)));

        }

        return ans;
    }
    
}
