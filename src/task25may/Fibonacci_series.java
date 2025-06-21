package task25may;

public class Fibonacci_series {
    public static void main(String[] args) {
        int number=3; int firstnum=0; int secondnum=1;
        for(int i=0;i<number;i++){
            System.out.print(firstnum+" ");
            int nexnum= firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nexnum;

        }
    }
}
