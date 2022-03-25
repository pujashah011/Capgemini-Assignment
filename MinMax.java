package com.capgass.pack;

public class MinMax {
    public void getAns(int[] a, int b){
        int temp;
        for(int i = 0; i < b; i++){
            for (int j = i+1; j<b ; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }
        System.out.println("Minimum element of the array: "+a[0]);

        System.out.println("Maximum element of the array:  "+a[b-1]);

    }
    public static void main(String[] args) {
        MinMax obj= new MinMax();
        int a[] = {5,4,9,2,3};
        int b = a.length;
        obj.getAns(a,b);


    }
}
