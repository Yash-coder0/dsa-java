class Solution {
    public String sortVowels(String s) {
        char[] vowels = new char[s.length()];
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                vowels[j] = s.charAt(i);
                j++;
            }
        }
        Arrays.sort(vowels,0,j);
        StringBuilder sb = new StringBuilder(s);
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                sb.setCharAt(i,vowels[k]);
                k++;
            }
        }
        return sb.toString();


    }
}