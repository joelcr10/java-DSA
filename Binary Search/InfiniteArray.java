

public class InfiniteArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,12,13,14,15,16,17};
        System.out.println(ans(arr,9));
    }

    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int temp = end + 1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        System.out.println(start+" "+end);
        return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        System.out.println(start+" "+end);
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid; 
            }
        }
        return -1;
    }
}
