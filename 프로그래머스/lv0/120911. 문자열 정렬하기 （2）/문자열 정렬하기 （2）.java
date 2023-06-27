import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        String[] mys = answer.split("");
        Arrays.sort(mys);
        String my = "";
        for (int i = 0; i < mys.length; i++) {
            my += mys[i];
        }
        return my;
    }
}