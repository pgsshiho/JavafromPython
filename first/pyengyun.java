package first;

import java.util.Scanner;

public class pyengyun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 숫자를 입력 해주세요");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자를 입력 해주세요");
        int second = sc.nextInt();
        System.out.print("세 번쨰 숫자를 입력 해주세요");
        int third = sc.nextInt();
        float result = (first + second + third)/3;
        System.out.printf("%.2f", result);
    }
}
