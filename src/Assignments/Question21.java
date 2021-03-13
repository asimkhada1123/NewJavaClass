package Assignments;


import java.util.Scanner;

public class Question21 {

    public static String getting (int a){
        String ReValue="";

        switch(a){

            case 1:
                ReValue="monday";
                break;
            case 2:
                ReValue="Tuesday";
                break;
            case 3:
                ReValue="Wednesday";
                break;
            case 4:
                ReValue="Thrusday";
                break;
            case 5:
                ReValue="Friday";
                break;
            case 6:
                ReValue="Saturday";
                break;
            case 7:
                ReValue="Sunday";
                break;


        }
        return ReValue;
    }



    public void display(String b){

        System.out.println("The day of the week is: "+b);
    }

    public static void main(String[] args) {
        Scanner b= new Scanner(System.in);
        System.out.println("Enter day");
        int day= b.nextInt();

        Question21 obj= new Question21();
        String hello=Question21.getting(day);
        obj.display(hello);
    }



}
