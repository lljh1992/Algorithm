import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n[] = new int[9];
    int max = 0;
    int index = 0;

    for (int i = 0; i < 9; i++) {
      n[i] = sc.nextInt();
    }
    sc.close();

    for (int i = 0; i < 9; i++) {
      if (n[i] > max) {
        max = n[i];
        index = i + 1;
      }
    }

    System.out.println(max);
    System.out.println(index);
  }
}
