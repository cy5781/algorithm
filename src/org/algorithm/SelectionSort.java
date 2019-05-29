package org.algorithm;

/**
 * Created by ming on 2019/5/28.
 */
public class SelectionSort {

    private SelectionSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0 ;i< n ; i++){
            int minIndex = i;
            for(int j = i+1 ; j< n ;j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                    //swap(arr,j,minIndex);
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(Object[] arr , int i ,int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        // 测试排序算法辅助函数
        int N = 10000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SelectionSort.sort( arr );
        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("org.algorithm.SelectionSort", arr);
        return;
    }
}
