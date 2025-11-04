class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        if(s.charAt(0)==')'){
            return false;
        }
        else {
            count++;
        }
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)=='(') count++;
            else{
                count--;
                if(count<0){
                    answer = false;
                    return answer;
                }
            }    
        }
        if(count==0) return true;
        else return false;
    }
}