class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        // split메서드는 " "띄어쓰기마다 구분하여 배열에 저장한다.
        answer = my_string.split(" ");    
        return answer;
    }
}