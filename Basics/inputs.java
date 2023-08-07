import java.util.Scanner;

public class inputs {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter some number: ");
        int rollno = inp.nextInt();
        System.out.println("the rollno is "+rollno);

        System.out.print("Enter name: ");
        String name = inp.next();
        System.out.println("the name is "+name);

        System.out.print("Enter float number: ");
        float fl = inp.nextFloat();
        System.out.println("the float  is "+fl);

        inp.close();

       

    }
}
