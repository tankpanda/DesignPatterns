package com.hhd.patterns.strategy;

public class SorterAble {
    /**
     * 实现MyComparable接口 对象内增加比较方法
     * @param arr
     */
    public void sort(MyComparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j<arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) < 0 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(MyComparable[] arr, int i, int j) {
        MyComparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
