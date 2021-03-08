package Assignments;

import java.util.Scanner;

public class Question32 {


//  private  int [] array = new int [5];
//
//    public Question32(int [] array) {
//        this.array = array;
//    }

    public int total(int [] array){

        int total = 0;
        for (int i = 0; i<5; i++){
            total = total + array[i];
        }

        return total;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int [] myArray = new int[5];

        System.out.println("Enter elements of an array :");

        for(int i = 0 ; i<5; i++){
            myArray[i] = sc.nextInt();
        }

       // System.out.println(myArray[4]);
        Question32 ar = new Question32();
        System.out.println("Total = " + ar.total(myArray));

    }


}
