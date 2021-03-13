package Assignments;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Map;

public class Question41 {


    //Should work for long String as well
    public static void main(String args[]){
        String s = "Programminnggg999";


        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c,1);
            }
        }

        System.out.println(map);
    }
}
