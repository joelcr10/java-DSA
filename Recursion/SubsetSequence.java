package Recursion;

import java.util.ArrayList;

public class SubsetSequence {
    public static void main(String[] args) {
        // subSeq("abc","");
        System.out.println(subSeq2("abc", ""));
    }

    public static void subSeq(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        subSeq(str.substring(1),ans+ch);
        subSeq(str.substring(1), ans);
    }

    public static ArrayList<String> subSeq2(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subSeq2(str.substring(1),ans+ch);
        ArrayList<String> right = subSeq2(str.substring(1), ans);

        left.addAll(right);
        return left;
    }

    
    
}
