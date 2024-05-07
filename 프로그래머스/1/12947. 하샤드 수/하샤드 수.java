class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int length = Integer.toString(x).length();
        int sum = 0;
        int temp = x;
        
        for (int i = 0; i < length; i++) {
            sum += temp % 10;
            temp /= 10;
        }
        
        if (x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}