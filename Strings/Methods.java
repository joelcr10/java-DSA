package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args){
        String name = "Joel C Raju";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('C'));
        System.out.println("   assd   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
    
}
