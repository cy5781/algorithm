package org.algorithm;

/**
 * Created by ming on 2019/5/28.
 */
public class BubbleSort {

    private BubbleSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0 ;i < n ;i ++){
            for(int j = 0 ;j < n - i -1 ; j++){
                if(arr[j].compareTo(arr[i])>0){
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void swap(Object[] arr , int i ,int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int N = 10000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("org.algorithm.BubbleSort", arr);
        BubbleSort.sort(arr);
        SortTestHelper.printArray(arr);
        return;
    }

}
