package Assignments;

import java.util.Scanner;

public class Question27 {

    public static int multi(int n){
        int beta=1;

        while(n!=0){
        int lastdigit=n%10;
        beta= lastdigit*beta;
        n=n/10;
    }
    return beta;
    }

    public static int sum(int n){
        int beta=0;

        while(n!=0){
            int lastdigit=n%10;
            beta= lastdigit+beta;
            n=n/10;
        }
        return beta;
    }





    public static void main(String[] args) {
        Scanner input=new Scanner((System.in));
        System.out.println("ENter the number");
        int num= input.nextInt();
        int fi=Question27.multi(num);
        int f1=Question27.sum(num);
        System.out.println("Multiplication IS: "+ fi);
        System.out.println("Sum IS: "+ f1);


    }
}
