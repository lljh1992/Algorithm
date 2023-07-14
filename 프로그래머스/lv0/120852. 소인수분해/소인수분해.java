import java.util.ArrayList;
import java.util.List;
class Solution {
    public List solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
            }
                n /= i;
        }
        
    }
        return list;
}
}