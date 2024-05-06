import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String temp = "";
        String[] arr = String.valueOf(n).split("");

        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i = 0; i < arr.length; i++){
            temp += (arr[i]);
        }
        
        return Long.parseLong(temp);
        
        
    }
}