package com.masai.Evaluation_2;
//import java.util.Objects;
import java.util.Scanner;

public class StringManipulator {
    public  String removeVowels(String input)
    {
        StringBuilder out1 = new StringBuilder("");
        if(input == null){
            return null;
        }else {
            for (int i = 0; i < input.length(); i++){
                if(input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o' && input.charAt(i) != 'u'){
                    out1.append(input.charAt(i));
                }
        }
        }
        return out1.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid String : ");
        StringManipulator value =  new StringManipulator();
        String input = sc.next();
//        String res = "";

       String res = value.removeVowels(input);
        System.out.println(res);
    }
}
