package Test01;


import java.util.Scanner;

public class joon10 {

  public static void main(String[] args) {
    //첫째 줄에 (A+B)%C,
    //둘째 줄에 ((A%C) + (B%C))%C,
    // 셋째 줄에 (A×B)%C,
    // 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
    int A = 0;
    int B = 0;
    int C = 0;
    Scanner scanner = new Scanner(System.in);

    A = scanner.nextInt();
    B = scanner.nextInt();
    C = scanner.nextInt();

    System.out.println((A + B) % C);
    System.out.println(((A % C) + (B % C)) % C);
    System.out.println((A * B) % C);
    System.out.println(((A % C) * (B % C)) % C);
  }
}

