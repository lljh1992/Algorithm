class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수이다.
        if (str2.contains(str1)) {
            answer = 1;
        }
        return answer;
        }
    }
