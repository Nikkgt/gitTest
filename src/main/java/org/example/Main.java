package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(5+5);
        System.out.println(5+5*10);
        int oneHundred = newMethod(1);
        char[] chars = {'0','9','f','2','f','q'};
        int[] numbers = {1,5,2,8,9,9,0,0,2,5,67,8,4,3,2,5,6,77,1};
        System.out.println(bubbleSort(numbers));
    }
    public static int newMethod(int number){
        while (number<=100){
            number++;
        }
        return number;
    }

    public static int[] bubbleSort(int[] arr){
        int minNumber = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<minNumber){
                    minNumber = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            minNumber = Integer.MAX_VALUE;
            minIndex = -1;
        }
        for (int value:arr) {
            System.out.print(value+" ");
        }
        return null;
    }
}