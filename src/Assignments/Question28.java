package Assignments;

import java.util.Scanner;

public class Question28 {

    public static boolean prime(int a,int b) {
        // int dividing=2;
        float check = 1;
        int panda = 0;

        for (float dividing = 2; dividing < a; dividing++) {
            check = a % dividing;
            if (check == 0) {
                panda = 2;
            }
        }

        if (panda == 2) {

            if (b==1){
                System.out.println();
                System.out.println("It is not a prime number");
            }

            return false;
        } else {
           // System.out.println("It is a prime number");

            if (b==1){
                System.out.println();
                System.out.println("It is not a prime number");
            }

           return true;

        }

    }


    public static void nth(int n,int b){
        int number=2;
        int count=1;
        int fl=0;
        while(count<=n){

            if (Question28.prime(number,b)){
                fl=number;
                number+=1;
                count+=1;

            }
            else
            {
                number+=1;
            }

        }
        System.out.println();
        System.out.println("The nth requesteed answer is: "+fl);
        System.out.println();
    }


    public static void bet(int n,int n1,int c){
        int number=2;
        int count=1;
        int fl=0;
        int simple=0;




        while(count<=n1){

            if (Question28.prime(number,c)){
                fl=number;
                number+=1;
                count+=1;


            }
            else
            {
                number+=1;
                simple=fl;
            }

            if(count-1>n && count-1<n1 && simple!=fl){
                System.out.println("Found prime number: "+fl);

            }
        }
       // System.out.println("The final requested answer is: "+fl);

        System.out.println();
    }






    public static void main (String[]args){
            int boba=1;
            Scanner inp = new Scanner(System.in);
        System.out.println("Enter the num");
        int num= inp.nextInt();
//        Question28.prime(num);
           System.out.println("which prime number do u want");
        int num3= inp.nextInt();
        System.out.println("Type the first interval of prime");
            int num1 = inp.nextInt();
            System.out.println("Type the second interval of prime");
            int num2 = inp.nextInt();


            Question28.prime(num,boba);
            boba=0;
            Question28.nth(num3,boba);
            Question28.bet(num1,num2,boba);


        }
    }

