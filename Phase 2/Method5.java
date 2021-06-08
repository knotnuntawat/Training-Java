

public class Method5 {
    public static void main(String[] args) {
        int[] numberA = {10,20,30,40,50};
        displayArray(numberA);
       /* for(int i=0;i<numberA.length;i++){
            System.out.println("ลำดับที่ "+i+" ค่า "+numberA[i]);
        }*/

        int [] numberB = {-50,-40,-30,-20,-10,0};
        displayArray(numberB);
      /*  for(int i=0;i<numberB.length;i++){
            System.out.println("ลำดับที่ "+i+" ค่า "+numberB[i]);
    }*/
    double [] price = {320.50,500.25,858.32,177.99};
        displayDouble(price);
}
//แสดงผลตัวเลขใน array ที่ส่งเข้ามาทำงานในเมธอด
static void displayArray(int [] arr){
    
    System.out.print("{");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        if(i<arr.length-1){
            System.out.print(",");
        }
    }
    System.out.println("}");
}
static void displayDouble(double [] arr){
    
    System.out.print("{");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        if(i<arr.length-1){
            System.out.print(",");
        }
    }
    System.out.println("}");
}
}