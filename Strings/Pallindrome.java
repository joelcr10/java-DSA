package Strings;

public class Pallindrome {
    public static void main(String[] args){
        String str  = "Joel C Raju";
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);

            if(start != end){
                System.out.println(false);
            }
        }

        System.out.println(true);
    }
    
}