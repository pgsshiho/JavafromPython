package first;

import java.util.Scanner;

public class deliver {
    public static void main(String[] args) {
        System.out.println("물건 가격 입력");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        if (price < 50000) {
            System.out.println("총 결제금액은"+(price+2500));
        }
        else {
            System.out.println("총 결제금액은"+price);
        }
    }
}
