package com.hhd.patterns.strategy;

public class Sorter<T> {
    /**
     * 将比较器传入 作为比较策略
     * @param arr
     * @param compator
     */
    public void sort(T[] arr, MyCompator<T> compator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j<arr.length; j++) {
                minPos = compator.compare(arr[j],arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
