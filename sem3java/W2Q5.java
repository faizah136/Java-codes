package com.mycompany.sem3java;
import java.util.Scanner;
public class W2Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate of the 1st point : ");
        int x1 = sc.nextInt();
        System.out.println("Enter the y co-ordinate of the 1st point : ");
        int y1 = sc.nextInt();
        System.out.println("Enter the x co-ordinate of the 2nd point : ");
        int x2 = sc.nextInt();
        System.out.println("Enter the y co-ordinate of the 2nd point : ");
        int y2 = sc.nextInt();
        double d = Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
        System.out.println("Distance between the 2 points = " + d);
        
    }
}
