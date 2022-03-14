package com.masai.Evaluation_2;

import java.util.Scanner;



public class Range {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Start Number : ");
        int start = sc.nextInt();

        System.out.println("Please Enter a Finish Number : ");
        int end = sc.nextInt();

        System.out.println("Enter a Increament value : ");
        int val = sc.nextInt();

        if(start <= 0){
            System.out.println("PLease enter a positive number or Greater then 0");
        }else{
            for(int i = start; i <= end; i=i+val){
                System.out.println(i+" ");
            }

        }


    }
}
