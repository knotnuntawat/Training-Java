import java.util.*;

public class MaxMinLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNumber = 0, minNumber = Integer.MAX_VALUE;
        while (true) {
            System.out.print("ป้อนตัวเลข : ");
            int number = sc.nextInt();
         if(number<0) break; //ถ้าติดลบเด้งออก
         if(number>maxNumber) maxNumber=number;
         if(number<minNumber) minNumber=number;
        }
        System.out.println("ค่ามากสุด = "+maxNumber);
        System.out.println("ค่าน้อยสุด = "+minNumber);

        sc.close();
    }
}
