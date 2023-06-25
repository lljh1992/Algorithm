class Solution {
    public String solution(String my_string, int[] indices) {
        //사용자에게 입력 받은 값을 배열로 변환
        String[] arr = my_string.split("");
        
        //반복문을 통해 indices를 먼저돌려준다.
       for (int i = 0; i < indices.length; i++){
           //inidces배열 원소 값이 index이므로 해당 inedx의 arr값을 !로 바꾸어 준다. 
           arr[indices[i]] = "!";
       }

       String answer = "";
        //반복문을 통해 arr배열을 돌려준다.
       for (int i = 0; i < arr.length; i++){
           //아까 변환해준 값인 !가 아닐 경우 answer에 값을 순차적으로 저장한다.
           if (!arr[i].equals("!")){
               answer += arr[i];
           }
       }
        return answer;
    }
}