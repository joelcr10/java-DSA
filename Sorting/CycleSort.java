package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args){
        int[] arr = {4,3,5,2,1};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    public static int[] cycleSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            } 
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] = temp;
    }

}
