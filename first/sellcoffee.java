package first;

import java.util.Scanner;

public class sellcoffee {
    public static void main(String[] args) {
        int a=2000;
        int b=3000;
        int c=3500;
        Scanner sc=new Scanner(System.in);
        System.out.println("아메리카노 판매 개수 : ");
        int aa = sc.nextInt();
        System.out.println("카페라떼 판매 개수 : ");
        int bb = sc.nextInt();
        System.out.println("카푸치노 판매 개수 : ");
        int cc = sc.nextInt();
        int result = (a*aa)+(b*bb)+(c*cc);
        System.out.println("총매출은"+result+"원 입니다.");
    }
}
