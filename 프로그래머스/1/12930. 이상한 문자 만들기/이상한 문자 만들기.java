class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int length = arr.length;
        int count = 0;
        
        for (int i = 0; i < length; i++) {
            if (arr[i].equals(" ")) {
                answer += " ";
                count = 0;
            } else {
                if (count % 2 == 0) {
                    answer += arr[i].toUpperCase();
                } else {
                    answer += arr[i].toLowerCase();
                }
                count++;
            }
        }
        
        return answer;
    }
}