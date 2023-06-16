class Solution {
    public int[] solution(int[] num_list) {
        // num_list 배열의 마지막 원소의 값을 조건에 맞게 계산한 값인 원소를
        // 추가해야하므로, num_list의 길이에서 한 자리를 추가
        int[] answer = new int[num_list.length + 1];
        // 마지막 원소가 될 index 변수를 생성
        int index = 0;
        // 만약 num_list의 마지막 원소가 그전 원소보다 크다면 index에 마지막
        // 원소에서 그전 원소를 뺀 값을 할당
        // 조건을 충족하지 못하면, index에 마지막 원소를 두 배한 값을 할당
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            index = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {
            index = num_list[num_list.length -1] *2;
        }
        for (int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        // 마지막 원소 자리에는 앞선 if문에서 구한 index 변수 값을 할당
        answer[answer.length -1] = index;
        return answer;
    }
}