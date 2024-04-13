/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");

        Solution solution = new Solution();

        String[] words1 = {"leet","code"};
        char x_to_find1 = 'e';
        List<Integer> count1 = solution.findWordsContaining(words1, x_to_find1);
        System.out.println("Count = " + count1);

        String[] words2 = {"abc","bcd","aaaa","cbc"};
        char x_to_find2 = 'a';
        List<Integer>  count2 = solution.findWordsContaining(words1, x_to_find2);
        System.out.println("Count = " + count2);

    }
}


