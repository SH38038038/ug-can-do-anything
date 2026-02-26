import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        Random rand = new Random();
        
        for(int k=0; k<commands.length; k++){
            int start = commands[k][0];
            int end = commands[k][1];
            int idx = commands[k][2];
            
            int[] sub = Arrays.copyOfRange(array, start-1, end);
            answer[k] = quickselect(sub, 0, sub.length-1, idx-1, rand);
}
        return answer;
    }
    private int quickselect(int[] arr, int left, int right, int k, Random rand) {
        while (left<=right){
            int pivotIndex = left + rand.nextInt(right-left+1);
            swap(arr, pivotIndex, right);
            
            int p = partition(arr, left, right);
            if(p == k){
                return arr[p];
            }else if(k<p){
                right = p-1;
            }else{
                left=p+1;
            }
        }
        return -1;
    }
    
    private int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int store = left;
        
        for(int i=left; i<right; i++){
            if (arr[i] < pivot){
                swap(arr, i, store);
                store++;
            }
        }
        swap(arr, store, right);
        return store;
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}