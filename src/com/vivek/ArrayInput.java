package com.vivek;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input using for loop
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

//        //printing array
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //printing array using toString() in Arrays class
        System.out.println(Arrays.toString(arr));
    }
}
