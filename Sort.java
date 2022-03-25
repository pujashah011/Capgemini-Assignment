package com.capgass.pack;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int a[] = {5,4,9,2,3};
        Arrays.sort(a);
        System.out.println("Array sorted in ascending order");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
