package com.vivek;

import java.util.Arrays;
import java.util.Scanner;

public class Stringinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modifiy
        str[2] = "vivek";
        System.out.println(Arrays.toString(str));

    }

}
