import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        // int n = inp.nextInt();

        int n = 100;

        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }

        inp.close();

        int num = 1;
        while(num<=5){
            System.out.print(num+" ");
            num+=1;
        }
    }
    
}
