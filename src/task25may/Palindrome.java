package task25may;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String s="wow";
        String pal="";
        s=s.toLowerCase(Locale.ROOT);
        System.out.println("Length of  a String is"+s.length());
        for(int i=s.length()-1;i>=0;i--){
            pal = pal+s.charAt(i);

        }
        System.out.println(pal);
        System.out.println(s);
        if(pal==s){
        System.out.println("String is Palindirme");
        }
        else{
            System.out.println("String is not Palindirme");
        }
    }}

