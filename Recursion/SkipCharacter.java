package Recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(skipAChar(str));
    }

    public static String skipAChar(String str){
        if(str.isEmpty()){
            return "";
        }
        char temp = str.charAt(0);
        if(temp=='a'){
            return skipAChar(str.substring(1));
        }else{
            return temp+skipAChar(str.substring(1));
        }  
    }
    
}
