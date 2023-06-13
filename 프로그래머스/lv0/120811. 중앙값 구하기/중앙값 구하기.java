import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);             // 배열을 오름차순으로 정리
        for(int i=0; i<array.length; i++){
         if(i == array.length/2){
             answer = array[i];
         }   
        }
        return answer;
    }
}