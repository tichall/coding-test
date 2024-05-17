import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        answer = Arrays.stream(arr)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
        return answer;
    }
}