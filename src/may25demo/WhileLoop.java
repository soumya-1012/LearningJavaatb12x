/*package may25demo;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int guess;
        int attempts = 0;
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
        while (true) {
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Number is greater");

            } else if (guess < number) {
                System.out.println("Number is lesser");
            } else {
                System.out.println("Number is correct");

            }
            attempts++;
            System.out.println("Number of attempts"+attempts);
        }


    }






}*/
