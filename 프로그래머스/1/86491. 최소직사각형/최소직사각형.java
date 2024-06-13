class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int length1 = 0;
            int length2 = 0;
            
            if (sizes[i][0] > sizes[i][1]) {
                length1 = sizes[i][0];
                length2 = sizes[i][1];
            } else {
                length1 = sizes[i][1];
                length2 = sizes[i][0];
            }
    
            max1 = length1 > max1 ? length1 : max1;
            max2 = length2 > max2 ? length2 : max2;
        }
        return max1 * max2;
    }
}