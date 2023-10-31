import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int i = 0;
    int result = 0;

    for (i = 1; i <= 9; i++) {
      result = n * i;
      System.out.printf("%d * %d = %d", n, i, result);
      System.out.println();
    }
  }
  
}
