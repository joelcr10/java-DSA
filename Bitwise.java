public class Bitwise {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1,3,4};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^=n;
            
        }

        return unique;
    }
}
