class Solution {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            int splitNum = (int) (n % 10);
            answer[i] = splitNum;
            n /= 10;
        }
        return answer;
    }
}