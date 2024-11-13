package first;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("파티참석 인원 : ");
        int people = sc.nextInt();
        System.out.println("치킨"+people+"마리");//치킨(1인 한 마리), 콜라(1인 2캔), 감자칩(1인 1개),치킨(9000), 콜라(400), 감자칩(700)
        System.out.println("콜라"+(people*2)+"캔");
        System.out.println("감자칩"+people+"개");
        System.out.println("총 금액"+((people*9000)+(people*700)+(people*400*2))+"원");
    }
}
