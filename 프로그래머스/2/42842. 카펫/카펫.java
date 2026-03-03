import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int square = brown + yellow;
        for(int height = 1; height <= square; height++){
            if(square % height == 0){
                int width = square/height;
                if(height<=width){
                    if((height-2)*(width-2)==yellow){
                        return new int[] {width, height};
                    }
                }
            }
        }
        return new int[]{};
    }
}