package com.mycompany.sem3java;
import java.util.Scanner;
public class W5Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element "+(i+1));
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        boolean flag = false;
        int e = sc.nextInt();
        for(int i = 0; i<n; i++){
            if(a[i]==e){
                System.out.println("Element found at index " + i);
                flag = true;
            }
    
        }
        if(flag == false)
                System.out.println("Element not found");
        
    }
    
}
