package Tasks;

import java.util.Scanner;
import java.lang.System;

public class Task24May {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month");
        int month=sc.nextInt();
        System.out.println("Enter Year");
        int year=sc.nextInt();


    switch(month)
    {
        case 1,3,5,7,8,10,12:
            System.out.println(+month+"Month has 31 days");
            break;
        case  4,6,9,11:
            System.out.println(+month+"Month has 30 days");
            break;
        case 2:
            if(month==2 && year%4==0 && year%100==0 && year%400==0)
            {
                System.out.println("leap year"+year+" feb has 29 days");
            } else if (month==2 && year%4!=0) {
                System.out.println(" not a leap year"+year+" feb has 28 days");

            }

        default:
            System.out.println("Enter number with in 1 to 12");

    }
}}
