import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        for (int i = 0; i < (num_list.length / 2); i++) {
            int j = num_list.length - i - 1;
            int temp = num_list[i];
            num_list[i] = num_list[j];
            num_list[j] = temp;
        }
        return num_list;
    }
}