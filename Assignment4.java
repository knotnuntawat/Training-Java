import java.util.*;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

     /*   
     System.out.print("กรุณาใส่ค่าองศาเซลเซียส : ");
        float cel = sc.nextFloat();

//แปลง celsius เป็น Fahrenheit
        float fahren = (cel*9/5)+32;
        System.out.println(cel+" องศาเซลเซียส เท่ากับ "+fahren+" องศาฟาเรนไฮต์");
        */

        ///////////////////

//แปลง Fahrenheit เป็น celsius
   System.out.print("กรุณาใส่ค่าองศาฟาเรนไฮต์ : ");
   float fahren = sc.nextFloat();
   System.out.println(fahren+" องศาฟาเรนไฮต์ เท่ากับ "+((fahren-32)*5/9)+" องศาเซลเซียส");

        sc.close();
    }
}
