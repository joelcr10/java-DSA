import java.util.Scanner;
import java.util.Arrays;


public class Array {
    public static void main(String[] args){
        int[] ros = new int[5];

        Scanner in = new Scanner(System.in);
        for(int i=0;i<ros.length;i++){
            ros[i] = in.nextInt();
        }

        for(int i=0;i<ros.length;i++){
            System.out.println(ros[i]);
        }

        //enhanced arrays

        for(int num: ros){
            System.out.println(num);
        }

        System.out.println(Arrays.toString(ros));

        String[] str = new String[5];
        for(int i = 0; i<str.length;i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        in.close();
    }
    
}
