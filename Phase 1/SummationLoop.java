import java.util.*;

public class SummationLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        // หาผลรวม 1-5
        int sum = 0, count = 0;
        while (true) {
            System.out.print("ป้อนตัวเลข (ถ้าป้อนค่าลบ คือการออกจากloop): ");
            int number = sc.nextInt();
            if (number < 0)
                break;
            count++;
            sum = sum + number; // ผลรวมตัวเลข 0 + 1+2+3+4+5

        }

        System.out.println("ผลรวม = " + sum);
        System.out.println("จำนวนครั้งที่ป้อน = " + count);
        System.out.println("ค่าเฉลี่ย = " + (sum / count));
        // avg = sum/round

        sc.close();
    }
}
