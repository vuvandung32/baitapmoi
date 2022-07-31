import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------bài 4---------------------------------------");
        System.out.println("mời bạn nhập số :");
        int x = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }

        System.out.println("---------------------------------------------bài 5---------------------------------------");

        System.out.println("mời bạm nhập chuỗi kí tự");
        String input = scanner.nextLine();
        StringBuffer str = new StringBuffer(input);
        System.out.println(str.reverse().toString());

        System.out.println("---------------------------------------------bài 6---------------------------------------");
        System.out.println(" mời bạn nhập chuỗi ");
        String inDex = scanner.nextLine();
        String[] arr = inDex.split(" ");
        String chuoi = "";

        for (int i = 0; i < arr.length; i++) {
            chuoi = chuoi + (arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1));
            chuoi = chuoi + " ";

        }
        // for (String chuoi1 : arr) {
        // chuoi = chuoi+(chuoi1.substring(0,1).toUpperCase()+chuoi1.substring(1));
        // chuoi=chuoi+ " ";

        System.out.println(chuoi);

        System.out.println("---------------------------------------------bài 7---------------------------------------");
        System.out.println("mời bạn nhập số  ");
        int doiTime = scanner.nextInt();
        int H = doiTime / 3600;
        int m = doiTime % 3600 / 60;
        int s = doiTime % 3600 % 60;
        System.out.println(H + ":" + m + ":" + s);
        System.out.println("---------------------------------------------bài 8---------------------------------------");
        System.out.println(" mời bạn nhập chuõi:");
        String chuoiMoi = scanner.nextLine();
        boolean kq = true;
        char[] haha = chuoiMoi.toCharArray();
        for (int i = 0; i < haha.length; i++) {
            for (int j = i + 1; j < haha.length; j++) {
                if (haha[i] == haha[j]) {
                    kq = false;
                }
            }

        }
        System.out.println(kq);

    }

}
