package org.algorithm;

/**
 * Created by ming on 2019/5/28.
 */
public class InsertSort {

    private InsertSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0 ; i< n ; i++){
            for( int j= i; j >0 ; j--){
                if(arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }else {
                    break;
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

        // 测试排序算法辅助函数
        int N = 20;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SelectionSort.sort( arr );
        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("org.algorithm.InsertSort", arr);
        return;
    }

}
