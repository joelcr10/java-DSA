import java.util.*;
import java.util.HashMap;
public class Hashtable {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        checkDuplicate(nums);
    } 

    public static boolean checkDuplicate(int[] nums){
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(int item : nums){
            if(hash.containsKey(item)){
                return true;
            }else{
                hash.put(item);
            }
        }

        return false;
    }
}
