package twice;

import java.util.Scanner;

public class triagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("삼각형의 한 변을 입력하세요");
        int a = sc.nextInt();
        System.out.println("삼각형의 한 변을 입력하세요");
        int b = sc.nextInt();
        System.out.println("삼각형의 한 변을 입력하세요");
        int c = sc.nextInt();
        if (a+b > c && a + c > b && b + c > a) {
            System.out.println("올바른 삼각형");
        }
        else {
            System.out.println("올바른 삼각형이 아닙니다");
        }
    }
}
