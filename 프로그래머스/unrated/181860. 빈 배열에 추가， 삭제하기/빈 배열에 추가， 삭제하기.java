import java.util.Stack;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> list = new Stack<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for(int j = 0; j < arr[i] * 2; j++){
                    list.push(arr[i]);
                }
              } else {
                for(int j = 0; j < arr[i]; j++){
                    list.pop();
                }
            }  
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
            return answer;
        }
        
    }
