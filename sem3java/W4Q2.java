package com.mycompany.sem3java;
import java.util.Scanner;
public class W4Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            System.out.println("Enter element " + (i+1));
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        System.out.println("The entered array is: ");
        for(int e:a){
            System.out.print(e + " ");
        }
        
        System.out.println("\nsum of all the elements = " + sum);
    }
    
}
