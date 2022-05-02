import java.util.HashMap;

public class Question {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int currSum = 0;
        int start = 0;
        int end = -1;
        int max=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < N; i++){
            currSum += A[i];
            if(currSum == K){
                start = 0; end = i;
                if((end-start+1)>max) //comparing subarray size 
                max=end-start+1;
            }
            
            if(map.containsKey(currSum - K)){
                start = map.get(currSum - K) + 1;
                end = i;
                if((end-start+1)>max)
                max=end-start+1;
            }
            if(map.containsKey(currSum))//if we get two same keys with different values
            map.getOrDefault(currSum,0);
            else
            map.put(currSum,i);
        }
        
        if(end == -1) return 0;
        
        return max;
    }
    public static void main(String[] args) {
        // Longest Sub-Array with Sum K 
        int [] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int len = lenOfLongSubarr(arr, arr.length, k);
        System.out.println(len);
    }
}
