import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);       
        // 배열 오름차순으로 정렬
        
        answer = numbers[numbers.length-2] * numbers[numbers.length-1];
        // 정렬한 배열의 마지막 전 과 마지막 값을 곱한다.
        return answer;
    }
}