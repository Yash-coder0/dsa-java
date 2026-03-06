class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while(x != 0){
            int digit = x%10;
            reversed = reversed*10 + digit;
            x = x / 10;
        }
        if(reversed >= -1*Math.pow(2,31) && reversed <= Math.pow(2,31)){
            return (int)reversed;
        }else{
            return 0;
        }
    }
}