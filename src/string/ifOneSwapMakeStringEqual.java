package string;

import java.util.ArrayList;
import java.util.List;

public class ifOneSwapMakeStringEqual {
    // 1790

    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "dbca";
        System.out.print(new ifOneSwapMakeStringEqual().areAlmostEqual(s1, s2));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> diffIndexStore = new ArrayList<>();

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                diffIndexStore.add(i);
            }
            if(diffIndexStore.size() > 2) return false;
        }

        if(diffIndexStore.size() == 0)
                return true;

        return diffIndexStore.size() == 2
                && s1.charAt(diffIndexStore.get(0)) == s2.charAt(diffIndexStore.get(1))
                && s1.charAt(diffIndexStore.get(1)) == s2.charAt(diffIndexStore.get(0));  // s1 = "bank" && s2 = "kany"
    }
}
