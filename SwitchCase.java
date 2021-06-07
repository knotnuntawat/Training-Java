import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
      /*  System.out.print("ป้อนเลขเดือน : ");
        int month = sc.nextInt();

      //ตัวอย่างถ้าเป็น if else  
        if (month == 1) {
            // System.out.print("มกราคม");
            name = "มกราคม";
        } else if (month == 2) {
            // System.out.print("กุมภาพันธ์");
            name = "กุมภาพันธ์";
        } else if (month == 3) {
            // System.out.print("มีนาคม");
            name = "มีนาคม";
        } else {
            // System.out.print("อื่นๆ");
            name = "อื่นๆ";
        }
        System.out.println("เดือนที่ "+month + " คือเดือน " + name);
        */
/*
    //ตัวอย่างถ้าเป็น Switch case
        switch (month) {
            case 1:
                name = "มกราคม";
                break;
                case 2:
                name = "กุมภาพันธ์";
                break;
                case 3:
                name = "มีนาคม";
                break;
                default:
                name = "เดือนอื่นๆ";
                break;
        }
        System.out.println("เดือนที่ "+month + " คือเดือน " + name);
        */
        System.out.print("ป้อนอาการ : ");
        String panic = sc.nextLine();

        switch (panic) {
            case "ปวดหัว":
                name = "ไมเกรน";
                break;
                case "ปวดท้อง":
                name = "โรคกระเพาะ";
                break;
                case "ปวดไหล่":
                name = "โรคแก้บัค";
                break;
                case "ปวดไต":
                name = "เกลือกาชา";
                break;
                default:
                name = "โรคอื่นๆ";
                break;
        }
        System.out.println("อาการ "+panic + " คือโรค " + name);

        sc.close();
    }
}
