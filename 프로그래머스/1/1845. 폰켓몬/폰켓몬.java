import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int maxPick = nums.length / 2;
        int uniqueTypes = map.size();
        
        return Math.min(maxPick, uniqueTypes);
    }
}