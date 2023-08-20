package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(pad("","29"));
    }

  public static ArrayList<String> pad(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        int inc = 0;
        int start = 0;
        if(digit==7){
            inc=1;
        }
        if(digit==8){
            start = 1;
            inc = 1;
        }
        if(digit==9){
            start= 1;
            inc = 2;
        }
        for(int i=(digit-2)*3 + start;i<(digit-1)*3+inc;i++){
            char ch = (char)('a'+i);
            list.addAll(pad(p+ch,up.substring(1)));
        }

        return list;
    }  
    
}
