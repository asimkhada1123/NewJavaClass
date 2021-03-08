package Assignments;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input=new Scanner((System.in));
        System.out.println("Enter a number");
        int number=input.nextInt();

        if(number%2==0){
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
}
