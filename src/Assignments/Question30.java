package Assignments;

import java.util.Scanner;

public class Question30 {

    public void fib(int n){
        int def=1;
        int def1=1;
        int fina=0;
        int i=3;

        System.out.print(1);
        System.out.print(" "+1);

        while(i<=n){
            fina =def+def1;
            System.out.print(" "+fina);
            def=def1;
            def1=fina;
            i+=1;

        }

    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the nth term");
        int nth= input.nextInt();
        Question30 obj=new Question30();
        obj.fib(nth);

    }
}
