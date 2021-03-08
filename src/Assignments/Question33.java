package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question33{

    public int[] ascending(int [] array){

       Arrays.sort(array);
        return array;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int [] myArray = new int[5];

        System.out.println("Enter elements of an array :");

        for(int i = 0 ; i<5; i++){
            myArray[i] = sc.nextInt();
        }

        Question33 qu = new Question33();
        int arr[] = qu.ascending(myArray);
        System.out.println("Array created is : " + Arrays.toString(arr));

    }


}
