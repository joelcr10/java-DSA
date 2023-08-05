package Recursion;

public class NumberExample {
    public static void main(String[] args){
        print(1);
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(nums, 7, 0, nums.length-1));
    }

    static void print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        int mid = start+(end-start)/2;
        if(start>end){
            return -1;
        }

        if(target==nums[mid]){
            return mid;
        }

        if(nums[mid]>target){
            System.out.println(nums[mid]+" "+mid+" "+start+" "+end);
            binarySearch(nums, target, start, mid - 1);
        }
        else{
            System.out.println(nums[mid]+" "+mid+" "+start+" "+end);
            binarySearch(nums, target, mid+1, end);
        }

        return -1;
    }
}
