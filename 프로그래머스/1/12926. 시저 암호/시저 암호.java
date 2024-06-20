import java.util.Arrays;
class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        String answer = "";
        
        for (int i = 0; i < length; i++) {
            if(arr[i] == ' ') {
                answer += ' ';
            } else if(Character.isUpperCase(arr[i])) {
                answer += (char)((arr[i] + n - 65) % 26 + 65);
            } else if (Character.isLowerCase(arr[i])) {
                answer += (char)((arr[i] + n - 97) % 26 + 97);
            }
        }
        return answer;
    }
}