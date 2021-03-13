package Assignments;

public class Question43 {

    public static void main(String args[]){

        int [] a = new int[] {1,2,3};

        int b = 0;

        try{
            final int i = a[3] / b;
            System.out.println(" a/b = " + i);
        }catch (ArithmeticException E){
            System.out.println("There is Arithmetic Exception Error");
        }
        catch (ArrayIndexOutOfBoundsException E){
            System.out.println("Array is out of Bound ");
        }
//        final int i = a/b;

    }
}
