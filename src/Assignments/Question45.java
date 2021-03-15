package Assignments;

import java.io.File;
import java.util.*;

public class Question45 {

    public static void main(String[] args) throws Exception {

        String data = "";

        File myFile = new File("C:\\Users\\anujs\\IdeaProjects\\JavaClass_12\\Hello");
        Scanner scan = new Scanner(myFile);

        while (scan.hasNextLine()) {
            data = scan.nextLine();
            System.out.println(data);
        }

        List<String> list = Arrays.asList(data.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);

        for(String word : uniqueWords)
        {
           // System.out.println(Collections.frequency(list,word));
            int counter = Collections.frequency(list,word);

            if(counter > 1){
                System.out.println(word);
            }
            //if(Collections.frequency(list,word))
        }
    }
}
