package task25may;

import java.util.Locale;

public class Vowels_Consonants {
    public static void main(String[] args) {
        String s="Appliunhjke";
        int vc=0;
        int cc=0;

        s=s.toLowerCase(Locale.ROOT);
       System.out.println("Length of string is"+s.length());
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               vc++;
           }
           else{
               cc++;
           }


       }
        System.out.println("Vowel Count is"+vc);
        System.out.println("Consonant Count is"+cc);

    }
}
