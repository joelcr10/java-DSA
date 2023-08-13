package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubsetIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetDuplicates(arr);
        for(List<Integer> lsit : ans){
            System.out.println(lsit);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            System.out.println("outer: "+outer);
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                System.out.println("internal: "+internal);
                outer.add(internal);
            }
        }

        return outer;
    }

    //creating subset when there are duplicate elements in the array
    static public List<List<Integer>> subsetDuplicates(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){

            start = 0;
            if(i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            System.out.println("outer: "+outer);

            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                System.out.println("internal: "+internal);
                outer.add(internal);
            }
        }

        return outer;
    }
}
