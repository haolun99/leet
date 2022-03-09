package array;

// 1160

import java.util.Arrays;

public class findWordCanBeFormed {
            public static void main(String[] args){
                String [] array = {"cat", "bt", "hat", "tree"};
                String chars = "attach";
                System.out.println(countCharacters(array, chars));
            }

        public static int countCharacters(String[] words, String chars){
            //
            int count = 0;
            int[] seen = new int[26];
            //Count char of Chars String
            for (char c : chars.toCharArray())
                seen[c - 'a']++;
            // Comparing each word in words
            for (String word : words) {
                // simple making copy of seen arr
                int[] tSeen = Arrays.copyOf(seen, seen.length);
                int Tcount = 0;
                for (char c : word.toCharArray()) {
                    if (tSeen[c - 'a'] > 0) {
                        tSeen[c - 'a']--;
                        Tcount++;
                    }
                }
                if (Tcount == word.length())
                    count += Tcount;
            }
            return count;


        }
}
