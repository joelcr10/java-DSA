package Sorting;

class MissingNumber {
    public static void main(String[] args){
        int[] nums = {0,4,2,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index<nums.length; index++){
            if(nums[index]!=index){
                return index;
            }
        }

        return nums.length;
    }

    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] = temp;
    }
}
