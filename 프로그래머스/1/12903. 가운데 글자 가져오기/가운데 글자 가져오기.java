class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        //String[] arr = s.split("");
        
        if (length % 2 == 0) {
            return s.substring(length / 2 - 1, length / 2 + 1);
        } else {
            return s.substring(length / 2, length / 2 + 1);
        }
        
    }
}