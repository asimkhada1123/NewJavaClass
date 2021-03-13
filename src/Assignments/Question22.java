package Assignments;

import java.util.Scanner;

public class Question22 {

    public static void multiple(int a){
        int number=1;

        for(int i =1;i<11;i++){
            number=a*i;
            System.out.println("ANS: "+number );
        }
//Bondis@Programmer2021
    }

    public static void main(String[] args) {
        Scanner ip= new Scanner((System.in));
        System.out.println("Enter a number");
        int n=ip.nextInt();
        Question22.multiple(n);
    }
}
