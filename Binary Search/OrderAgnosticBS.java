public class OrderAgnosticBS {
    public static void main(String[] args){
        
    }

    public static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        
        while(start<=end){
            int mid = start + (end-start)/2;

            if(isAsc){
                if(target>arr[mid]){
                start = mid+1;
                }
                else if(target<arr[mid]){
                    end = mid -1;
                }
                else{
                    return mid;
                }
            }
            else{ 
                if(target<arr[mid]){
                start = mid+1;
                }
                else if(target>arr[mid]){
                    end = mid -1;
                }
                else{
                    return mid;
                }
            }
            
        }
        return -1;
    }
    
}
