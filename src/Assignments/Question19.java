package Assignments;

import jdk.dynalink.StandardNamespace;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question19 {

    public static String Calculate(int a,int b,int c){
        String S= "";
        if (a==b && b==c && c==a){
            S="Equilateral Triangle";
        }

        else if ((a==b)||(b==c)||(c==a))
        {
            S= "Isosceles Triangle";
        }

        else if (!(a==b && b==c && c==a)){
            S= "Scalene Triangle";
        }

        return S;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a");
        int num1= input.nextInt();
        System.out.println("Enter b");
        int num2= input.nextInt();
        System.out.println("Enter c");
        int num3= input.nextInt();

        String Ans=Calculate(num1,num2,num3);
        System.out.println(Ans);
    }
}
