package string;

public class ConsecutiveCharacter {
    // 1446
    public static void main(String[] args){
        String str = "tourist";
        System.out.println(maxPower(str));

    }

    public static int maxPower(String s) {
    char c = s.charAt(0);
    int maxCount = 1;
    int count = 1;
    for(int i = 1; i < s.length(); i++){
        if(s.charAt(i) == c){
            count++;
            maxCount = Math.max(count, maxCount);
        }else{
            count = 1;
            c = s.charAt(i); // iterate to current character, compared with next one later
        }
    }

        return maxCount;
    }
}
