package Assignments;

import java.util.Scanner;

public class Question12 {


    int roll;
    String name;
    String nationality;

    public Question12() {

    }

    public Question12(int roll, String name, String nationality){
        this.roll = roll;
        this.name = name;
        this.nationality = nationality;

        System.out.println("The roll is " + roll);
        System.out.println("The name is " + name);
        System.out.println("The nationality is "+ nationality);
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter roll,name and nationality: ");

        int roll = myObj.nextInt();

        myObj.nextLine();
        String name = myObj.nextLine();
        String nationality = myObj.nextLine();

        System.out.println(roll);
        System.out.println(name);
        System.out.println(nationality);


        Question12 ques = new Question12(roll,name,nationality);
    }
}
