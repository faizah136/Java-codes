package com.mycompany.sem3java;
import java.util.Scanner;
public class W5Q4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();
    int a[] = new int[n];
    int max = a[0];
    int min = a[0];
    for(int i = 0; i<n; i++){
        System.out.println("Enter element "+(i+1));
        a[i] = sc.nextInt();
        if(a[i]>max)
            max = a[i];
        else
            min = a[i];
    }
    System.out.println("Max = "+max+ "   Min = "+min);
}
    
}
