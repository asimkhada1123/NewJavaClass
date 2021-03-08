package Assignments;

import java.util.Scanner;

public class Question18 {

    public void Compute(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("A is greater");
        }
        else if( b>a && b>c){
            System.out.println("B is greater");
        }
        else
            System.out.println("C is greater");

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number a: ");
        int num1= input.nextInt();
        System.out.println("Enter number b: ");
        int num2= input.nextInt();
        System.out.println("Enter number c: ");
        int num3= input.nextInt();
        Question18 ob= new Question18();

        ob.Compute(num1,num2,num3);
    }
}
