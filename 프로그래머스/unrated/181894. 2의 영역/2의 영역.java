import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int f = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                f = i;
                break;  
            } 
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2) {
                b = i;
                break;  
            }
        }
        
        if (f == 0 && b == 0) {
            return new int[]{-1};
        }
        
        for (int i = f; i <= b; i++) {
            list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}