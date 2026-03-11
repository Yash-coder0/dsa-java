class Solution {
    public int strStr(String haystack, String needle) {
        int i, k = 0, j;
        for(i = 0; i <= haystack.length() - needle.length(); i++){
            if(needle.charAt(0) == haystack.charAt(i)) {
                k = i;
                for(j = 0; j < needle.length(); j++) {
                    if(needle.charAt(j) != haystack.charAt(k)) {
                        break;
                    }else {
                        k++;
                    }
                }
                if(j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}