class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        char[] ans = new char[n];
        for(int i = n - 1; i >= 0; i--){
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u'){
                sb.deleteCharAt(i);
            }else{
                break;
            }
        }

        String answer = sb.toString();
        return answer;


    }
}