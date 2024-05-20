class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        if (s.length() == 4 || s.length() == 6) {
            for (char i : arr) {
                if (i >= 48 && i <= 57) {
                    answer = true;
                } else {
                    return false;
                }
            }
        } else {
            answer = false;
        }
    
        return answer;
    }
}