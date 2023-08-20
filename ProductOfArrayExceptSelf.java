import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));    
    }

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int productZero = 1;
        for(int item: nums){
            if(item==0){
                product = 0;
            }else{
                product*=item;
                productZero*=item;
            }
        }

        System.out.println(product+" "+productZero);

        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i] = productZero;
            }
            else{
                ans[i] = product/nums[i];
            }
        }

        return ans;
    }

    
}
