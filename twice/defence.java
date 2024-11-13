package twice;

import java.util.Random;
import java.util.Scanner;

public class defence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int A= rand.nextInt(3)+1;
        System.out.println("막을 위치를 고르세요! 1,2,3");
        int D = sc.nextInt();
        if (D==A){
            System.out.println("수비에 성공했습니다!");
        }
        else{
            System.out.println("수비에 실패했습니다");
        }
    }
}
