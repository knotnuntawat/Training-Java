public class ArrayBasic3 {
    public static void main(String[] args) {

        // Array 2 มิติ
        String[][] products = {

                { "เก้าอี้", "โต๊ะ", "โคมไฟ" }, 
                { "คีบอร์ด", "เม้าส์", "แป้นพิมพ์" },
                { "ลิปสติก", "โรลออน", "ครีม" }, 
            };
      /*  // product[เลขแถว][เลขคอลัมม์]
        System.out.println(products[2][1]); // แถวก่อน ตามด้วยคอลัมม์

        // เปลี่ยนค่า
        products[2][1] = "ห่วงยาง";
        System.out.println("หลังเปลี่ยน " + products[2][1]);
        */
   //loop for     
        for(int row = 0;row<products.length;row++){ //เริ่มจากแถว
          for(int column =0;column<products[row].length;column++){
            System.out.println("แถวที่ = "+row+" คอลัมม์ = "+column+" เก็บค่า = "+products[row][column]);
          }
        }
    }
}
