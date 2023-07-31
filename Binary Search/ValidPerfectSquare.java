public class ValidPerfectSquare {
    public static void main(String[] args){
        System.out.println(isPerfectSquare(2147483647));
    }

    public static boolean isPerfectSquare(int num) {
        if(num==0 || num==1){
            return true;
        }
        
        long start = 0;
        long end = num;
        while(start<=end){
            long mid = start + (end-start)/2;
            System.out.println(start+" "+mid+" "+end);
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num && (mid+1)*(mid+1)>num){
                return false;
            }
            else if(mid*mid>num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }

        return true;   
    }
}
