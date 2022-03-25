package com.capgass.pack;

import static jdk.nashorn.internal.objects.Global.print;

public class ReverseArray {
    public void rev(int[] a, int n){
        int[] b = new int[n];

        int j = n;
        for(int i = 0; i<n;i++){
            b[j-1] = a[i];
            j = j-1;
        }
        System.out.println("Reversed Array");
        for(int k=0; k<n; k++){
            System.out.print(b[k]);
        }

    }
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int a[]= {2,4,1,8,9};
        obj.rev(a, a.length);
    }
}
