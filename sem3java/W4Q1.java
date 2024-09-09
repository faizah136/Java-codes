package com.mycompany.sem3java;
import java.util.Scanner;
public class W4Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[]= new int [n];
        for(int i=0; i<n; i++){
            a[i] = (i+1)*10;
        }
        System.out.println("The array is:");
        
        for(int e:a){
            System.out.print(e + " ");
        }
    }
}
