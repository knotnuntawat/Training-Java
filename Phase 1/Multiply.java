import java.util.*;
public class Multiply {
    public static void main(String[] args) {
        /*
         * int m=2; 
         * for(int x=1;x<=12;x++){ 
         * System.out.println(m+ " x "+x+ " = "+(m*x));
         * 
         * }
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาใส่สูตรคูณเริ่มต้น : ");
        int start = sc.nextInt();
        System.out.print("กรุณาใส่สูตรคูณสุดท้าย : ");
        int stop = sc.nextInt();
        System.out.println("");
        for (int i = start; i <= stop ; i++) {
            System.out.println("แม่ที่ "+i);
            for (int j = 1; j <= 12; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));

            }
            System.out.println(" ");


       /* for (int i = 2; i <= 5; i++) {
            System.out.println("แม่ที่ "+i);
            for (int j = 1; j <= 12; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));

            }
            System.out.println(" ");

        }*/
    }
    sc.close();
  }
}
