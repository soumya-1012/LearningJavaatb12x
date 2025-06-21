package Tasks;

import java.util.Scanner;

public class Task24MayFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Factorial of 0 is 1");
        }
       if (number > Integer.MAX_VALUE) {
            System.out.println("Factorial of max number is invalid");
        }
        if (number < 0) {
            System.out.println("Factorial is invalid for negative numbers");
        }
        int fact=1;
       for(int i=1;i<=number;i++){
          fact=fact*i;
       }
       System.out.println("factorial of number"+number+" is "+fact);


    }}





