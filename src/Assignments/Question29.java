package Assignments;

import java.util.Scanner;

public class Question29 {

    public static float fact(float n){
        float fin=0;
        for(float i=n-1;i>=1;i--){

            if(i==n-1) {
                fin = n * i;
            }
            else {
                fin = fin * i;
            }
        }
        return fin;
    }


    public static float div(float h){
        float fff=1F;

        while(h>=2) {
            fff = (fff + h / fact(h));
            h=h-1;
        }
        return fff;
    }




    public static void main(String[] args) {
        Scanner inp= new Scanner((System.in));
        System.out.println("Enter the number of terms");
        float terms= inp.nextInt();
        float ANSWER=Question29.div(terms);
        System.out.println("THE FINAL: "+ANSWER);

    }
}
