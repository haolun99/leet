package hashing;

import java.util.HashSet;

public class isValidSudoku {

    // 36

    public boolean isValidSudoku(char[][] board){
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        // Create Hashset for each row/col/box according to the number of them
        for(int r = 0; r < N; r++){
            rows[r] =  new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r = 0; r < N; r++){
            for(int c = 0; c < N; c++){
                char val = board[r][c];

                if(val == '.') {continue;}

                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                int numOfBox = (r / 3) * 3 + c / 3;
                if(boxes[numOfBox].contains(val)){
                    return false;
                }
                boxes[numOfBox].add(val);


            }
        }

        return true;
    }
}
