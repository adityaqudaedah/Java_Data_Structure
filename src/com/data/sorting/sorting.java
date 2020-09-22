package com.data.sorting;

import java.util.Arrays;

class sorting {
    //method of insertion sort
    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j]>temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
        System.out.print(Arrays.toString(data));
    }

    //method of selection sort
    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) min = j;
            }
            if (min != i) {
                int temp1 = data[i], temp2 = data[min];
                data[min] = temp1;
                data[i] = temp2;
            }
            System.out.println(Arrays.toString(data));
        }
//        System.out.print(Arrays.toString(data));
    }
    //method of bubble sort
    public static void bubbleSort(int[]data){
        for (int i=0;i<data.length-1;i++){
            int flag = 0;
            for(int j=0;j<data.length-1-i;j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];data[j+1]=temp;
                    flag = 1;
                }
            }
            if(flag==0) break;
        }
        System.out.print(Arrays.toString(data));
    }
}
