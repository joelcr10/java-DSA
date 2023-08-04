package Strings;

public class Comparison {
    public static void main(String[] args){
        String a = "joel";
        String b = "joel";

        System.out.println(a==b); //will print true coz they are pointing to the same object

        String name1 = new String("joel");
        String name2 = new String("joel");
        System.out.println(name1==name2); //false, coz they are 2 separate objects
        System.out.println(name1.equals(name2)); // true, comparing the values of the object
        System.out.println(name1.charAt(0)); //returns "j" at the 0 index
        
    }
}
