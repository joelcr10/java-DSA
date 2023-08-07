import java.util.Arrays;
public class display {
    public static void main(String[] args){
        int c = 10;
        print("hey there "+c);
        fun(2,3,4,5,6,7);
        System.out.println(isArmstrong(153));
    }

    static void fun(int ...v){
        print(Arrays.toString(v));
    }

    static void print(String str){
        System.out.println(str);
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }

        if(sum==original){
            return true;
        }

        return false;
    }

    
    
}
