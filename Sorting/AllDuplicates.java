package Sorting;

public class AllDuplicates {
    public static void main(String[] args){
        int[] nums = {2,3,4,2,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }

        
        return -1;
    }

    public static void swap(int[] nums, int first, int seccond){
        int temp = nums[first];
        nums[first] = nums[seccond];
        nums[seccond] = temp;
    }
}