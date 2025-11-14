import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] pattern1 = {1, 2, 3, 4, 5};   
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};  
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
        
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % 5]) {
                s1++;
            }
            if (answers[i] == pattern2[i % 8]) {
                s2++;
            }
            if (answers[i] == pattern3[i % 10]) {
                s3++;
            }
        }
        
        int maxScore = Math.max(s1, Math.max(s2, s3));
        
        ArrayList<Integer> winnerList = new ArrayList<>();
        if (s1 == maxScore) {
            winnerList.add(1);
        }
        if (s2 == maxScore) {
            winnerList.add(2);
        }
        if (s3 == maxScore) {
            winnerList.add(3);
        }
        
        int[] answer = new int[winnerList.size()];
        for (int i = 0; i < winnerList.size(); i++) {
            answer[i] = winnerList.get(i);
        }
        
        return answer;
    }
}