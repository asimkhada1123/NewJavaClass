package Assignments;

import java.util.Arrays;

//
public class Question39 {

    public static void main(String args[]){

        int [] arr = {0};
        String str = "";
        String name = "Anuj Simkhada Minesota";

//        str = str + name.charAt(0) +;


        int lastName = 0;

        for(int i = 1; i<name.length(); i++){
            char ch = name.charAt(i);

            if(ch == ' '){
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = i+1;
            }
        }

        for(int i = 0; i<arr.length-1; i++){
           // char ch = name.charAt(arr[i]);
            str = str + name.charAt(arr[i]) + ". ";
        }

        int lasNum = arr[arr.length-1];

        for(int i = lasNum; i<name.length(); i++){
            str = str + name.charAt(i);
        }

        System.out.println(str);

    }


}