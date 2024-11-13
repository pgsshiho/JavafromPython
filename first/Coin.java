package first;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int price = sc.nextInt();
        int change = money - price;
        int c500 = change / 500;
        int c100 = (change % 500)/100;
        System.out.println("500원 동전의 갯수"+c500+"\n"+"100원 동전의 갯수"+c100+"\n");
    }
}
