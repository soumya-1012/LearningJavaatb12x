package task25may;

import java.util.Scanner;

public class number_reverse {
    public static void main(String[] args) {
        int  number;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()) {
            number = sc.nextInt();
            int rev=0;
            while(number!=0){
                rev=number%10;
                number=number/=10;
                System.out.print(rev);
            }
        }else{
            System.out.print("entered is not an integer");
        }




    }
}
