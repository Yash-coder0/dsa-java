class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1) return s;

        char[][] ans = new char[numRows][s.length()];
        int row = 0;
        int col = 0;
        int i = 0;

        while(i < s.length()){

            while(row < numRows && i < s.length()){
                ans[row][col] = s.charAt(i);
                row++;
                i++;
            }

            row = row - 2;
            col++;

            while(row > 0 && i < s.length()){
                ans[row][col] = s.charAt(i);
                row--;
                col++;
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < s.length(); c++){
                if(ans[r][c] != '\0'){
                    sb.append(ans[r][c]);
                }
            }
        }

        return sb.toString();
    }
}