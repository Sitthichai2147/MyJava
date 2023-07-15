import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Num (10 Digits): ");
        //รับค่ามาแล้วลบ space ออกแล้ว split ด้วย ,
        String[] numStr = sc.nextLine().replaceAll(" ", "").split(",");
        sc.close();

        //หาก input มาผิด ไม่ครบ 10 ตัว
        if (numStr.length != 10) {
            System.out.println("Input must be 10 Digits");
            return;
        }

        //แปลง string ที่รับมาเป็น array int
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(numStr[i]);
        }

        sort(num);
        //------------------ แปลง array int ที่ได้เป็น string -------------------//
        String result = "";
        for (int i = 0; i < num.length; i++) {
            result = result + num[i];
            if (i != 9) {
                result = result + (", ");
            }
        }
        System.out.println("Result: " + result);
    }

    //------------------ ไว้ทำการ sort จากน้อยไปมาก-------------------//
    public static void sort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
//------------------ -------------------//
}
