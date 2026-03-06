class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int i = 0;
        for(i = 0; i < n - 1; i++) {
            if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                continue;
            }else{
                break;
            }
        }
        int flag = 0, j = 0;
        for(j = i+1; j < n; j++) {
            if(s.charAt(j) == '1'){
                flag = 1;
                break;
            }
        }
        if(flag != 1 && j == n) {
            return true;
        }else {
            return false;
        }
    }
}