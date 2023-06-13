class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int index = 0;
        for(int i = num1; i <= num2; i++){
            answer[index] = numbers[i]; // nembers 배열에서 특정 인덱스 i의 값을 추출하여 answer 배열의 index 위치에 할당
            index++;
        }
        return answer;
    }
}