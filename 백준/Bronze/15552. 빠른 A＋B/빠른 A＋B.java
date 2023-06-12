import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt((br.readLine()));

    StringTokenizer st;   // 문자열을 토큰화한다. 즉 토큰은 분리된 문자열 조각으로, 스트링토크나이저 클래스는
                          // 하나의 문자열을 여러 개의 토큰으로 분리하는 클래스다.

    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
    }

    br.close();
    bw.flush();
    bw.close();
    

   


  }
}
