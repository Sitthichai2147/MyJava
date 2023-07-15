import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Text: ");
        String str = sc.nextLine();
        sc.close();

        String result = reverse(str);
        System.out.println("Result: " + result);
    }

    //------------- ---------------//
    public static String reverse(String str) {
        String[] words = str.split(" "); // แยกคำออกจากกันด้วย space
        String reverses = ""; //ไว้เก็บคำที่ reverses

        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]); //ไว้ reverses คำ
            temp.reverse();

            reverses = reverses + temp + " ";
        }

        return reverses;
    }
}
