// 최대 공약수 : 둘 중 더 작은 수 찾아, 그 수부터 1씩 줄여나가기
// 최소 공배수 : 더 작은 수로 나눠
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int smallNum = n < m ? n : m;
        int bigNum = n > m ? n : m;
        
        for (int i = smallNum; i >= 1; i--) {
            if (bigNum % i == 0 && smallNum % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        for (int i = 1; i <= smallNum; i++) {
            if ((i * bigNum) % smallNum == 0) {
                answer[1] = i * bigNum;
                break;
            }
        }
        
        
        return answer;
    }
}