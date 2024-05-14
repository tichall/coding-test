class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        String[] arr = s.split("");
        
        if (length % 2 == 0) {
            return arr[length / 2 - 1] + arr[length / 2];
        } else {
            return arr[length / 2];
        }
        
    }
}