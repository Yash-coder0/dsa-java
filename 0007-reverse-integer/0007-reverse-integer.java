class Solution {
    public int reverse(int x) {
        int digit = x;
        long reversed = 0;
        while(digit != 0) {
            int rem = digit % 10;
            reversed = reversed*10 + rem;
            digit = digit / 10; 
        }
        if(reversed <= Math.pow(2,31) - 1 && reversed >= -1*Math.pow(2,31)) {
            return (int) reversed;
        }else{
            return 0;
        }
    }
}