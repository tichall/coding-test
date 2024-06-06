class Solution {
    boolean solution(String s) {
        int pNum = 0;
        int yNum = 0;
        
        String[] arr = s.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("p")) {
                pNum++;
            } else if (arr[i].equalsIgnoreCase("y")) {
                yNum++;
            }
        }
        
        return pNum == yNum;

    }
}