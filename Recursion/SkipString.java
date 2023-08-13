package Recursion;

public class SkipString {
    public static void main(String[] args) {
        String str = "baccappled";
        System.out.println(skipString(str));
    }

    public static String skipString(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skipString(str.substring("apple".length()));
        }else{
            return str.charAt(0)+skipString(str.substring(1));
        }  
    }
    
}