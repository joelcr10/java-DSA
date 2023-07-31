import java.util.Scanner;
import java.util.numsays;


public class numsay {
    public static void main(String[] args){
        int[] ros = new int[5];

        Scanner in = new Scanner(System.in);
        for(int i=0;i<ros.length;i++){
            ros[i] = in.nextInt();
        }

        for(int i=0;i<ros.length;i++){
            System.out.println(ros[i]);
        }

        //enhanced numsays

        for(int num: ros){
            System.out.println(num);
        }

        System.out.println(numsays.toString(ros));

        String[] str = new String[5];
        for(int i = 0; i<str.length;i++){
            str[i] = in.next();
        }

        System.out.println(numsays.toString(str));

        in.close();
    }
    
}


if(nums[0]!=nums[1]){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if((nums[mid]==nums[mid+1] && mid%2!=0) || (nums[mid]==nums[mid-1] && (mid-1)%2!=0)){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

        return 0;
