import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays
            .stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (delete_list[j] == arr[i]) {
                    list.remove((Integer) arr[i]);
                    break;
                }
            }    
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}