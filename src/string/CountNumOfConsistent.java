package string;

import java.util.HashSet;
import java.util.Set;

public class CountNumOfConsistent {
    // 1684

    public static void main(String[] args){
        String str = "abc";
        String[] strArray = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(str, strArray));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = words.length;

        Set<Character> set = new HashSet<>();
        // Add all allowed characters from string to the hashset
        for(int i = 0; i < allowed.length(); i++){
                set.add(allowed.charAt(i));
        }

        for(String s : words){
            for(int j = 0; j < s.length(); j++){
                    if(!set.contains(s.charAt(j))){
                        ans--; // deduct one from total number of strings because this string is not eligible
                        break;
                    }
            }
        }

        return ans;
    }
}
