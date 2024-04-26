class Solution {
    public double solution(int[] numbers) {
        float sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}