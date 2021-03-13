package Assignments;

import java.util.Locale;

public class Question38 {

    public String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();
    }



    public static void main(String args[]){

        Question38 ques = new Question38();

        String palindrome = "hello";

     //   System.out.println(ques.reverseString(palindrome));
        if(ques.reverseString(palindrome).toLowerCase().equals(palindrome.toLowerCase())) {

            System.out.println(palindrome + " is a palindrome");
        } else {
            System.out.println(palindrome + " is not a palindrome");
        }
    }

}
