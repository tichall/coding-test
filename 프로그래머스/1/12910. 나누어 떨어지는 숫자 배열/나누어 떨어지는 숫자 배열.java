import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int [arr.length];
        int count = 0;
        Arrays.sort(arr);
        
        for (int i : arr) {
            if (i % divisor == 0) {
                answer[count] = i;
                count++;
            }
        } 
        
        if (count == 0) {
            answer[count] = -1;
            count++;
        }
        
        // 배열 완성 후 크기에 맞춰 잘라내기
        answer = Arrays.copyOf(answer, count);
        return answer;
    }
}