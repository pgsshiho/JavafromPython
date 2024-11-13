package first;

import java.util.Scanner;

public class onehundradage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하시오 : ");
        int age = sc.nextInt();
        int result = 100 - age;
        result = 2024+result;
        System.out.printf("%s씨는 %d년에 100살이시네요!", name, result);
    }
}
