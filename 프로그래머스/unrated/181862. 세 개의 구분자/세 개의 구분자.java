import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = myStr.split("a|b|c");
        for (String s : answer) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
//         for (int i = 0; i < answer.length; i++) {
//             list.add(answer[i]);
//             list.remove("");
//             }
        if(list.size() == 0){
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}