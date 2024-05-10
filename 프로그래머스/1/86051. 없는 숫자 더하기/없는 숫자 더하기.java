class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        for (int i : numbers) {
            arr[i] = 0;
        }
        
        for (int i : arr) {
            answer += arr[i];
        }
        return answer;
    }
}