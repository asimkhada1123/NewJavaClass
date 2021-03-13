package Assignments;

import java.util.Scanner;

public class Question25 {

    public String CAL(int no) {
        Scanner input1 = new Scanner(System.in);
        String nam = "";
        int mark = 0;
        int compare = 0;
        int highestmarks = 0;
        String highestname = "";

        for (int i = 1; i <= no; i++) {
            System.out.println("Enter Student's name:");
            nam = input1.next();
            System.out.println("Enter Student's marks");
            mark = input1.nextInt();


            if (mark > compare) {
                highestmarks = mark;
                compare = highestmarks;
                highestname = nam;
            }


        }
        return highestname;
    }


    public static void main(String[] args) {
        int st=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter how many students");
        st= input.nextInt();

        Question25 obj= new Question25();
        String end=obj.CAL(st);

        System.out.println("HIGHEST GETTER IS: "+end);

    }

}
