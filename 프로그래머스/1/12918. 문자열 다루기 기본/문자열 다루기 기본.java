class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        char[] arr = s.toCharArray();
        
        if (length == 4 || length == 6) {
            for (char i : arr) {
                if (i < 48 || i > 57) {
                    answer = false;
                } 
            }
        } else {
            answer = false;
        }
    
        return answer;
    }
}