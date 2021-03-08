package Assignments;

import java.util.Scanner;

public class Question20 {

    public int compute(int num1, int num2, String choice) {
        int result = 0;
        switch (choice) {

            case "addition":
                result = num1 + num2;
                break;

            case "substraction":
                result = num1 - num2;
                break;

            case "multiplication":
                result = num1 * num2;
                break;

            case "division":
                result = num1 / num2;
                break;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = input.nextInt();
        System.out.println("Enter number b");
        int b = input.nextInt();
        System.out.println("Enter choice");
        String c = input.next();

        Question20 obj = new Question20();

        int res = obj.compute(a, b, c);

        System.out.println("THe answer is: " + res);


    }
}

