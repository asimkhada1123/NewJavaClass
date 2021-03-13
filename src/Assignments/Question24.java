package Assignments;

import java.util.Scanner;

public class Question24 {

    public static int fac(int number){
        int ans=1;
        while(!(number<1)){
            ans=ans*number;
            number--;
        }
        return ans;
    }

    public void disp(int v){
        System.out.println("The final ans: "+v);
    }


    public static void main(String[] args) {
        Scanner bs= new Scanner((System.in));
        System.out.println("The number is: ");
        int taking= bs.nextInt();
        Question24 binit= new Question24();
       int bbb= Question24.fac(taking);
        binit.disp(bbb);
    }
}
