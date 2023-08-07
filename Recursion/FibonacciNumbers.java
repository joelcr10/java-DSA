package Recursion;
public class FibonacciNumbers{
    public static void main(String[] args){
        System.out.println(fib(6));
    }

    public static int fib(int n){
        
        if(n<2){
            return n;
        }
        System.out.println(n);
        return fib(n-1)+fib(n-2);
    }
    
}
