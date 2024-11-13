package twice;

import java.util.Scanner;

public class earrhquake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float scale = sc.nextFloat();
        if (scale < 2.0){
            System.out.println("지진계로만 탐지 가능합니다");
        }
        else if(scale < 4){
            System.out.println("물건들이 흔들리거나 떨어집니다");
        }
        else if(scale < 7){
            System.out.println("빈약한 건물의 피해가 있습니다");
        }
        else if(scale < 8){
            System.out.println("지표면의 균열이 생깁니다");
        }
        else if(scale < 10){
            System.out.println("대부분의 구조물이 파괴됩니다");
        }
    }
}
