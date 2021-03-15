package Assignments;

import java.util.*;
import java.io.*;
public class Question44{


    //Store key and value in hashmap
    //Store in file
    //Read data from file
    //Read data into hashmap
    //Ask user for data
    //Compare data with data from hashmap


    public static void main(String args[]) {
        HashMap<String, String> hmap = new HashMap<String, String>();

        hmap.put("Messi", "Spain");
        hmap.put("Ronaldo", "Juventus");

        try
        {
            FileOutputStream fos =
                    new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hmap);
            oos.close();
            fos.close();
            System.out.println("Success");
        }catch(Exception E)
        {
            System.out.println("Exception");
            //ioe.printStackTrace();
        }



        try{
            FileInputStream input = new FileInputStream("data");
            ObjectInputStream output = new ObjectInputStream(input);

            HashMap<String,String> map = (HashMap<String, String>) output.readObject();

            output.close();
            input.close();

            Scanner scan = new Scanner(System.in);

            System.out.println("Please Enter Name: ");
            String name = scan.nextLine();

            for(Map.Entry<String,String> m:map.entrySet()){
               // System.out.println(m.getKey());
                if(name.equals(m.getKey())){
                    System.out.println(m.getKey() + ": " + m.getValue() );
                }
            }

        } catch (Exception e) {
           // e.printStackTrace();
        }
    }

}
