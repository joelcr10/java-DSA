package Recursion;

public class Factorial {
    public static void main(String[] args) {
        // System.out.println(fact(10));
        System.out.println(sumOfDigits(12345));
        System.out.println(productOfDigits(234));
        System.out.println(reverse(234,0));
        System.out.println(toZero(8, 0));
     }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        
        return fact(n-1)*n;
    }

    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    public static int productOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }

    public static int reverse(int n,int sum){
        if(n==0){
            return 0;
        }
        
        return sum*10 + n%10 + reverse(n/10,sum);
    }

    public static int toZero(int n, int steps){
        if(n==0){
            return steps;
        }

        if(n%2==0){
            return toZero(n/2, ++steps);
        }

        return toZero(n-1, ++steps);
    }
    
}
