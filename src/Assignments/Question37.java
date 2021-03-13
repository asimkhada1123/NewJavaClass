package Assignments;

import java.util.Scanner;

public class Question37 {

    public int[][] array (int a, int b){

        Scanner in= new Scanner(System.in);
        int [][]vect= new int[a][b];

        for(int i= 0; i<vect.length;i++) {
            for (int k = 0; k < vect.length; k++) {
                System.out.println("Enter the element");
                vect[i][k] = in.nextInt();
            }
        }

        return vect;
    }


    public int [] [] add (int [][]a, int [][]b,int rows, int columns){

        int [][] sum= new int[rows][columns];
        int i=0;
        while(i<3) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
            i++;
        }
        return sum;

    }




    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= inp.nextInt();
        System.out.println("Enter the number of columns");
        int columns= inp.nextInt();
        Question37 obj=new Question37();
        int [] [] vect1= obj.array(rows,columns);
        int [] [] vect2= obj.array(rows,columns);

        for(int []name:vect1){
            for(int aa:name){
                System.out.print(aa+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int []name:vect2){
            for(int aa:name){
                System.out.print(aa+" ");
            }
            System.out.println();
        }


        int [] [] vect3= obj.add(vect1,vect2,rows,columns);

        System.out.println();
        System.out.println("The final vector summ is:");
        System.out.println();

        for(int []name:vect3){
            for(int aa:name){
                System.out.print(aa+" ");
            }
            System.out.println();
        }

    }


}