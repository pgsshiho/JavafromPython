package first;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반지름은?");
        int r = sc.nextInt();
        System.out.println("원의 둘레는"+(r*Math.PI*2));
        System.out.println("원의 넓이는"+(r*Math.PI*r));
        System.out.println("구의 겉넓이는"+((Math.PI*4)*(r*r)));
        System.out.println("구의 부피는"+(Math.PI*(4/3))*(r*r*r));
    }
}
