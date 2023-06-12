class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;
        int result = money/price;
        
        answer[0] = result;
        answer[1] = money - (result * price);
        
        return answer;
                   
    }
}