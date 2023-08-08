package Recursion;

import java.util.ArrayList;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        System.out.println(sorted2(arr, 0));
        System.out.println(linearSearch(arr,4, 0));
        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
    }

    public static boolean sorted(int[] arr,int i){
        if(i==arr.length-2){
            if(arr[i]>arr[i+1]){
                return false;
            }
            else{
                return true;
            }
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return sorted(arr, ++i);
    }

    //optimized sorted
    public static boolean sorted2(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }

        return arr[i]<arr[i+1] && sorted2(arr, ++i);
    }

    public static boolean linearSearch(int[] arr,int target, int i){
        if(i==arr.length){
            return false;
        }

        
        return arr[i]==target || linearSearch(arr, target, ++i);
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }

        if(arr[i]==target){
            list.add(i);
        }

        return findAllIndex(arr, target, ++i, list);
    }
}
