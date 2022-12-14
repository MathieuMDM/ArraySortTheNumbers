package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegres = getIntegres(5);
        int[] sorted = sortIntegres(myIntegres);
        printArray(sorted);

    }

    public static int[] getIntegres(int capacity){
        int[] array = new int[capacity];
        System.out.println("enter " + " integer values:\r");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++){
            System.out.println("element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegres(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);   //to samo co wyzej z wykorzystaniem metody java arrays
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }



}
