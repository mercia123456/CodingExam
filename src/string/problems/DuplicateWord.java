package string.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.replaceAll("\\.", "");
        st = st.toUpperCase();
        double d;


        String str1[] = st.split(" ");
        System.out.println(Arrays.toString(str1));
        System.out.println(str1[0].length());

        HashMap<String, Integer> uniques = new HashMap<String, Integer>();
        for (String word : str1) {

            //ignor words 1 or less characters long
            if (word.length() <= 1) {
                continue;

            }
            Integer existingCount = uniques.get(word);
            uniques.put(word, (existingCount == null ? 1 : (existingCount + 1)));

        }
        Set<Map.Entry<String, Integer>> uniqueSet = uniques.entrySet();
        boolean first = true;
        for (Map.Entry<String, Integer> entry : uniqueSet) {

            if (entry.getValue() > 1) ;
            {

                System.out.println((entry.getKey() + "=" + entry.getValue()));
                first = false;
            }
        }
        for (int j = 0; j <= str1.length - 1; j++) {
            System.out.print(str1[j].length() + " ");
        }
        System.out.println();

        int sum = 0;
        int count = 0;

        for (String str : uniques.keySet()) {
            if (uniques.get(str) > 0) {
                sum += str.length();
                count++;
            }
        }
        d = sum / count;
        System.out.println("Average: " + d);
    }

}



