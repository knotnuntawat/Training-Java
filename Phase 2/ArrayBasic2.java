
public class ArrayBasic2 {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50, 60, 70, 80 };

        // เก็บขนาดสมาชิก
        // System.out.println(number.length);

        // System.out.println(number [2]);
        /*
         * System.out.println(number [0]); 
         * System.out.println(number [1]);
         * System.out.println(number [2]); 
         * System.out.println(number [3]);
         * System.out.println(number [4]);
         * System.out.println(number [5]);
         * System.out.println(number [6]); 
         * System.out.println(number [7]);
         * System.out.println(number [8]);
         */

        int count = number.length; // 8

        // ลดรูป
        /*for (int i = 0; i < count; i++) {
           System.out.println("ตำแหน่งที่ "+i+" = " +number[i]);
        }
*/ 
/*String[] fruits = {"มะละกอ","มะม่วง","ทุเรียน"};

for (String data : fruits){
    System.out.println(data);

}*/
int sum=0;
for(int data : number){
 sum+=data;
}
System.out.println("ผลรวม "+sum);
    }
}
