package com.masai.Evaluation_3.Problem_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of birth ");
        String db = sc.next();

        try {
            DateTimeFormatter val = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(db, val);
            LocalDate latest = LocalDate.now();

            if (ChronoUnit.YEARS.between(ld, latest) < 0) {
                System.out.println("Date of birth should not be in future");
            } else {
                System.out.println("Your age is : " + ChronoUnit.YEARS.between(ld, latest) + "Years");
            }

        }catch(Exception e){
            System.out.println("please pass the date in the proper format");
        }

    }
}
