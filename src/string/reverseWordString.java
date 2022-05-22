package string;

public class reverseWordString {
    // 151
    public String reverseWords(String s) {
        String[] tran = s.trim().split("\\s+");
        String result = "";
        for(int i = tran.length - 1; i > 0; i--){
            result += tran[i] + " ";
        }

        return result + tran[0];
    }
}
