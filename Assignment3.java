import java.util.*;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // โปรแกรมคัดแยกเงิน
        System.out.print("กรุณาใส่จำนวนเงิน : ");
        int money = sc.nextInt();

        System.out.println("จำนวนเงิน : " + money);
        if (money >= 1000) {
            System.out.println("1000 บาท " + (money / 1000) + " ใบ");
            money = money % 1000;
        }
        if (money >= 500) {
            System.out.println("500 บาท " + (money / 500) + " ใบ");
            money = money % 500;
        }
        if (money >= 100) {
            System.out.println("100 บาท " + (money / 100) + " ใบ");
            money = money % 100;

        }
        if (money >= 50) {
            System.out.println("50 บาท " + (money / 50) + " ใบ");
            money = money % 50;

        }
        if (money >= 20) {
            System.out.println("20 บาท " + (money / 20) + " ใบ");
            money = money % 20;

        }
        if (money >= 10) {
            System.out.println("10 บาท " + (money / 10) + " เหรียญ");
            money = money % 10;

        }
        if (money >= 5) {
            System.out.println("5 บาท " + (money / 5) + " เหรียญ");
            money = money % 5;
        }
        if (money >= 2) {
            System.out.println("2 บาท " + (money / 2) + " เหรียญ");
            money = money % 2;

        }
        if (money >= 1) {
            System.out.println("1 บาท " + (money / 1) + " เหรียญ");
            money = money % 1;

            System.out.println("จำนวนเงินที่เหลือ " + money);
        }
    }
}
