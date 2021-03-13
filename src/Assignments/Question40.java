package Assignments;

public class Question40 {

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();
    }

    public static void main(String args[]) {

        Question40 ques = new Question40();

        System.out.println(ques.reverseString("Hello"));
    }
}
