import java.util.*;

public class ModLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("ป้อนตัวเลข : ");
            int num = sc.nextInt();
            if (num < 0)
                break;

            if (num % 2 == 0) {
                System.out.println("เลขคู่");
            } else {
                System.out.println("เลขคี่");
            }
        }
        sc.close();
    }
}
