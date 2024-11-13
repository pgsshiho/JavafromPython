package twice;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴를 선택해주세요 1:치킨, 2:피자, 3:햄버거");
        int menu = sc.nextInt();
        if(menu == 1) {
            System.out.println("치킨");
        }
        else if(menu == 2) {
            System.out.println("피자");
        }

        else if(menu == 3) {
            System.out.println("햄버거");
        }
        else {
            System.out.println("잘못된 요청입니다");
        }

    }
}
