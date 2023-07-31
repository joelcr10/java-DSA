public class FindInMountainArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(search(arr,3));
    }

    public static int search(int[] arr, int target ){
        int peak = peakIndexInMountainArray(arr); 
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(arr, target, peak, arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            else{
                end = mid; 
            }
        }
        return start;
    }

    public static int orderAgnosticBS(int[] arr, int target, int start, int end){
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
