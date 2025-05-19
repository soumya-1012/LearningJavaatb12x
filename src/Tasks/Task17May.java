package Tasks;

public class Task17May {


    public static void main(String[] args) {
        int a=20;
        String  result = a>20?"Number is greater than 20":"Number is less than 20" ;
        System.out.println(result);

        int b=10;
        String  result1 = b>20?(b>30?"yes":"no"):"Number is less than 20";
        System.out.println(result1);

        int x=80;
        int y =40;
        String result3= x>y?"X is greater than y":"X is less than y";
        System.out.println(result3);
        System.out.println(Math.max(x,y));

        int m=100;
        int n= 20;
        int o=90;
        String result4 = m>n?(m>o?"m is great":"o is great"):(n>o?"n is great":"o is great");
        System.out.println(result4);

        int age=6;
        String  result5 = age<18?"Minor":(age>65?"Senior":"Adult");
        System.out.println(result5);


    }


}

