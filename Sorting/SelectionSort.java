package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4,3,5,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-1-i;
            int maxIndex = 0;
            int max = Integer.MIN_VALUE;
            for(int j=0;j<=last;j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxIndex = j;
                }
            }

            swap(arr, last, maxIndex);
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] = temp;
    }
}


