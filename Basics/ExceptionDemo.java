public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            int c = divide(a,b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("this will always execute");
        }
    }

    public static int divide(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Do not divide by zero");
        }

        return a/b;
    }
}
