import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = String.valueOf(n);
        char[] arr = temp.toCharArray();
        for (char i : arr) {
            answer += ((int) i - '0');
        }

        return answer;
    }
}