class Solution {
    public int[] solution(long n) {
        String[] backNumber = String.valueOf(n).split("");
        int[] answer = new int[backNumber.length];
        for (int i = backNumber.length - 1; i >= 0; i--) {
            answer[backNumber.length - 1 - i] = Integer.parseInt(backNumber[i]);
        }
        return answer;
    }
}