package Assignments;

import java.util.Scanner;

public class Question13 {

    int age;

    public Question13(){

    }

    public int getAge() {
        System.out.println("The negative number is " + age);

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int age = scan.nextInt();

        if(age <0){
            Question13 ques = new Question13();
            ques.setAge(age);
            ques.getAge();
        }


    }
}
