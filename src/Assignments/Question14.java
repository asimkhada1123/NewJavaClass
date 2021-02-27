package Assignments;

import java.util.Scanner;

public class Question14 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers and = or > or <");

        int first = scan.nextInt();
        int second = scan.nextInt();

        scan.nextLine();
        String third = scan.nextLine();

        if(third.equals("=")){
            if(first == second){
                System.out.println("They are equal");
            }
            else {
                System.out.println("They are unequal");
            }
        }
        else if(third.equals(">")){
            if(first>second){
                System.out.println("First is greater than second");
            }
            else {
                System.out.println("Second is greater than first");
            }
        }
        else if(third.equals("<")){
            if(first<second){
                System.out.println("First is smaller than second");
            }
            else {
                System.out.println("Second is greater than first");
            }
        }
    }



}
