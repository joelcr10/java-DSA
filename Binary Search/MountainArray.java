

public class MountainArray {
    public static void main(String[] args){
        int[] arr = {6,1,2,3,4,5};
        System.out.println(peakIndexInMountainArray(arr));
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
}
