class Solution {
    public int minOperations(String s) {
        char[] ch = s.toCharArray();
        int op1 = 0;
        int op2 = 0;
        int i = 0;
        for(char c : ch) {
            if(i%2 == 0){
                if(c == '1') op1++;
            }else{
                if(c == '0') op1++;
            }

            if(i%2 == 0){
                if(c == '0') op2++;
            }else{
                if(c == '1') op2++;
            }
            i++;
        }
        return Math.min(op1,op2);

        // if(ch[0] == '0'){
        //     int i = 0;
        //     for(char c : ch){
        //         if(i%2 == 0){
        //             if(c == '1') op++;
        //         }else{
        //             if(c == '0') op++;
        //         }
        //         i++;
        //     }
        // }else{
        //     int i = 0;
        //     for(char c  : ch){
        //         if(i%2 == 0){
        //             if(ch[i] == '0') op++;
        //         }else{
        //             if(ch[i] == '1') op++;
        //         }
        //         i++;
        //     }
        // }
        // return op;
    }
}