package Recursion;

public class NumberExample {
    public static void main(String[] args){
        // print(1);
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(binarySearch(nums, 20, 0, nums.length-1));
    }

    static void print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(target==nums[mid]){
            return mid;
        }

        if(nums[mid]>target){
            System.out.println(nums[mid]+" "+mid+" "+start+" "+end);
            return binarySearch(nums, target, start, mid - 1);
        }
       
        System.out.println(nums[mid]+" "+mid+" "+start+" "+end);
        return binarySearch(nums, target, mid+1, end);
        


    }
}
