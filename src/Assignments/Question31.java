package Assignments;

import java.util.Scanner;

public class Question31 {

    public void seq(String c){
        String b="1";
        int d;
        System.out.println(b);
        for (int i=2; i<=c.length();i++){
             String s=Integer.toString(i);
            System.out.print(b+i);
            b= b+s;
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the number in String");
        String numbers= inp.next();
        Question31 obj=new Question31();
        obj.seq(numbers);

    }

}
