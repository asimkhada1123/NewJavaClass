package Assignments;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number between 0-128");
        int num= input.nextInt();
        char c= (char)num;
        System.out.println("ASCII IS: "+ c);
    }
}
