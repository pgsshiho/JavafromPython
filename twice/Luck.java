package twice;
import java.util.Random;

public class Luck {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(8);
        if (a == 0){
            System.out.println("집에 있어도 사망");
        }
        else if (a == 1){
            System.out.println("크게 다칠위험 있음");
        }
        else if (a == 2){
            System.out.println("굉장히 나쁨");
        }
        else if (a == 3){
            System.out.println("나쁨");
        }
        else if (a == 4){
            System.out.println("나쁘진않음");
        }
        else if (a == 5){
            System.out.println("좋음");
        }
        else if (a == 6){
            System.out.println("굉장히 좋음");
        }
        else if (a == 7){
            System.out.println("로또하는 것을 추천");
        }
    }
}
