import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            list.add(strArr[i]);
            if (strArr[i].contains("ad")) {
                list.remove(strArr[i]);
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}