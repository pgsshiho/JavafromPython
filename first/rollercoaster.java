package first;

import java.util.Scanner;

public class rollercoaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("키를 cm단위로 입력해주세요 : ");
        int cm = sc.nextInt();
        if (age >= 10 && cm >= 140){
            System.out.println("탑승가능합니다");
        }
        else {
            System.out.println("탑승 불가 합니다.");
        }
    }
}
