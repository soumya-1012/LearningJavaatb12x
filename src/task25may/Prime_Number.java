package task25may;

public class Prime_Number {

    public static void main(String[] args) {
        int number=353;
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
            }
            if(count==2){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
        }


    }

