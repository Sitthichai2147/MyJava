public class Ex2 {

    public static void main(String[] args) {
        String str1 = "Mary";
        String str2 = "Army";
        System.out.println(str1 + ", " + str2 + " = " + checkSimilar(str1, str2));

        str1 = "Maryy";
        str2 = "Armyy";
        System.out.println(str1 + ", " + str2 + " = " + checkSimilar(str1, str2));

        str1 = "Maryy";
        str2 = "Army";
        System.out.println(str1 + ", " + str2 + " = " + checkSimilar(str1, str2));

        str1 = "Marym";
        str2 = "Armyy";
        System.out.println(str1 + ", " + str2 + " = " + checkSimilar(str1, str2)); // Output: false
    }

    //-------------------- -----------------------//
    public static boolean checkSimilar(String str1, String str2) {
        //เช็คว่าความยาว str เท่ากันไหม
        if (str1.length() != str2.length()) {
            return false;
        }

        //แปลง str เป็น char array แล้วแปลงเป็นตัวเล็กหมดเพราะถือเป็นตัวเดียวกัน
        char[] str1Array = str1.toLowerCase().toCharArray();
        char[] str2Array = str2.toLowerCase().toCharArray();

        //ทำการเช็คว่า array ทั้งสองเหมือนกันไหม
        return checkEquals(str1Array, str2Array);
    }

//-------------------- -----------------------//
    public static boolean checkEquals(char[] array1, char[] array2) {

        //ไว้เช็คว่าตัวอักษรใน array1 มีอยู่ใน array2 และจำนวนเท่ากันไหม
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        //เช็คหากจำนวนตัวอักษรมีไม่เท่ากัน
        for (int i = 0; i < array1.length; i++) {
            count1[array1[i] - 'a']++;
            count2[array2[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
    //-------------------- -----------------------//
}
