package Assignments;

import java.util.Scanner;

public class Question23 {

    public int calculating(int n){
        int sum=0;
        for (int count=1; count <=n; count++){
            sum=sum+count;
        }
        return sum;

    }

    public void disp(int a){
        System.out.println("sum is: "+a);
    }


    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the nth number");
        int nth= inp.nextInt();

        Question23 ob= new Question23();
        int f= ob.calculating(nth);
        ob.disp(f);
    }
}
