class Solution {
    public int solution(int num1, int num2) {
        if (valid(num1) && valid(num2)) {
            int answer = num1 - num2;
            return answer;
        } else {
            return 0;
        }
        
    }
    
    // 제한 사항 확인 메서드
    public boolean valid(int number) {
        return number >= -50000 && number <= 50000;
    }
}