package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class DisappearedNumber {
    public static void main(String[] args){
        int[] nums = {2,4,2,1};
        System.out.println(missingNumber(nums));
    }
    public static ArrayList<Integer> missingNumber(int[] nums) {
        int i=0;
        
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int index = 0; index<nums.length; index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }

        return ans;
    }

    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] = temp;
    }
}
