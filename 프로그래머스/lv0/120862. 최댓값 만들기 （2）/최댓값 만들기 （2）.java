import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
    
        // 배열을 오름차순으로 정렬하면 음수부터 양수까지 정렬이 되는데,  
        // 양 끝에 있는 2자리 숫자를 서로 곱해서 대소비교를 하면 된다.
        Arrays.sort(numbers); 
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-2] * numbers[numbers.length-1];
        if (num1 < num2) {
            return num2;
        } else {
        return num1;
    }
}
}