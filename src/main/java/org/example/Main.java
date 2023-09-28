package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(5+5);
        System.out.println(5+5*10);
        int oneHundred = newMethod(1);
    }
    public static int newMethod(int number){
        while (number<=100){
            number++;
        }
        return number;
    }
}