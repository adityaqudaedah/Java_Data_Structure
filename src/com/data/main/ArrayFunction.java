package com.data.main;

import java.util.Arrays;
import java.util.Random;

class ArrayFunction {
    public static int linearSearch(int[] data, int target) {
        for (int index = 0; index < data.length; index++) {
            if (target == data[index]) return index;
        }
        return -1;
    }

    public static int findMin(int[] data) {
        int minValue = data[0];
        for (int i = 1; i < data.length; i++) {
            if (minValue > data[i]) minValue = data[i];
        }
        return minValue;
    }
    public static int findMax(int[]data){
        int maxValue = data[0];
        for(int i = 1;i<data.length;i++){
            if(maxValue < data[i]) maxValue = data[i];
        }
        return maxValue;
    }
    public static int findSum(int[]data){
        int sumValue = 0;
        for(int i= 0;i<data.length;i++){
            sumValue +=data[i];
        }
        return sumValue;
    }
    public static void insertionSort(Double data[]){
        for (int i = 1 ;i<data.length;i++){
            Double key = data[i];
            int j= i-1;
            while(j>=0&&key<data[j]){
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=key;
        }
        System.out.print(Arrays.toString(data));
    }
    public static void selectionSort(int data[]){
        for(int i = 0 ; i<data.length-1;i++){
            int min = i;
            for (int j = i+1; j<data.length;j++){
                if (data[min]>data[j])min = j;
            }
            if (min!=i){
                int temp = data[i];
                data[i]= data[min];
                data[min]= temp;
            }
        System.out.println(Arrays.toString(data));
        }
//        System.out.println(Arrays.toString(data));
    }
    public static void randomFill(int[]data,int max){
        Random gen = new Random();
        for(int i = 0 ;i<data.length;i++){
            data[i]=gen.nextInt(max);
        }
    }
    public static void randomFill(Double[]data){
        Random rand = new Random();
        for(int i = 0 ;i<data.length;i++){
            data[i]= rand.nextDouble();
        }
    }
    public static int binarySearch(int[]data,int target){
        int left = 0, right = data.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(target > data[mid]) left = mid+1;
            else if (target < data[mid]) right = mid-1;
            else if (target == data[mid]) return mid;
        }
        return -1;
    }
}
