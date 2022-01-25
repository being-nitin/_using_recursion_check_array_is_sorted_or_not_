package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// using recursion check array is sorted or not.

    int[] arr = {1,2,3,4,5};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[] arr,int index){
        if(index== arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
