package com.mycompany.sem3java;
import java.util.Scanner;
public class W5Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element "+(i+1));
            a[i] = sc.nextInt();
            int temp = a[0];
            a[0] = a[n-1];
            a[n-1] = temp;
        }
        System.out.println("The array after swapping is");
        for(int e:a){
            System.out.print(e+" ");           
        }
        
    }    
}
