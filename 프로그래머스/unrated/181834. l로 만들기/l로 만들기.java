class Solution {
    public String solution(String myString) {
        //알파벳 비교를 위해 char형 배열로 변환
        char[] arr = myString.toCharArray();
       String answer = "";

        //반복문을 통해 배열 전체를 순환 
       for (int i = 0; i < arr.length; i++){
           int count = 0;
           //알파벳을 l부터 z까지 돌려준다. 
           for (char j = 'l'; j <= 'z'; j++){
               //만약 원소 값이 j값이랑 일치하면 1을 더해준다. 
               if (arr[i] == j){
                   count++;
               }
           }
            
           //만약 count가 0인 경우는 겹치는 알파벳이 없다는 것이다.
           if (count == 0){
               //겹치는 게 없다는 것은 l 이하 알파벳이므로 l 로 변환 
               arr[i] = 'l';
           }
           //배열 값을 answer로 저장
           answer += arr[i];
       }
        return answer;
    }
}