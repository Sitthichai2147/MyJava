import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Seconds: ");
        int seconds = sc.nextInt();
        sc.close();

        String time = convertToTime(seconds);
        System.out.println("Result: " + time);
    }

    //-------------- ---------------//
    public static String convertToTime(int seconds) {
        int h = seconds / 3600; //หาชั่วโมง
        int m = (seconds % 3600) / 60; //หานาที
        int s = (seconds % 3600) % 60; //หาวินาทีที่เหลือ

        //foramt ตัวเลข
        String hh = format(h);
        String mm = format(m);
        String ss = format(s);

        return hh + ":" + mm + ":" + ss;
    }
    //ไว้เติม 0 เวลาค่าเลขน้อยกว่า 10 เช่น 7 นาที เป็น 07 นาที
    public static String format(int num) {
        if (num < 10) {
            return "0" + num;
        } else {
            return String.valueOf(num);
        }
    }
    //-------------- ---------------//
}
