package com.masai.Evaluation_2;
import java.util.Objects;
import java.util.Scanner;

public class StringManipulator {
    public  String removeVowels(String input)
    {


        for (int i = 0; i < arr.length; i++){
            if(arr.charAr(i) != 'a' || arr[i] != 'e' || arr[i] != 'i' || arr[i] != 'o' || arr[i] != 'u'){
               res = res + arr.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid String : ");
        String input = sc.next();
//        String res = "";

        StringManipulator value =  new StringManipulator();

        System.out.println(value.removeVowels(input));
    }
}
