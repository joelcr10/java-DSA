import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            default -> System.out.println("invalid fruit");
        }
        in.close();
    }
    
}
