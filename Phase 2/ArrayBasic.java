public class ArrayBasic {
    public static void main(String[] args) {
        //การสร้าง Array

        //แบบกำหนดขนาดเอาไว้
/*int [] number =new int [4];
//กำหนดค่าลงไป
number[0] = 10;
number[1] = 20;
number[2] = 30;
number[3] = 40;

System.out.println(number[3]);*/

        //แบบกำหนดสมาชิก
int []number={10,20,30,40,50,70};
System.out.println("ก่อน ตำแหน่งที่ 5 "+number[5]);
number[5]= 100; // เปลี่ยนค่าสมาชิกใย array ช่องที่ 5
System.out.println("หลัง ตำแหน่งที่ 5 "+number[5]);
    }
}
