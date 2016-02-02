package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("What the fuck?");

        int[] arr = new int[100];
        for(int i=0; i<arr.length; i++){
            arr[i] = i*8;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.print(arr[23]);
    }
}
