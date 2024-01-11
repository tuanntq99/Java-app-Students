package library;

import java.util.Scanner;

/**
 * @author ngotuan
 */
public class Helper {
    private static Scanner sc = new Scanner(System.in);

    /**
     * @param mes   tin nhan cho nguoi dung
     * @param error loi neu co
     * @return tra ve so int
     */
    public static int IntHelper(String mes, String error) {
        System.out.print(mes);
        int value = 0;
        try {
            value = Integer.parseInt(sc.nextLine());
            return value;
        } catch (Exception e) {
            System.out.println(error);
            return IntHelper(mes, error);
        }
    }

    /**
     * @param mes       tin nhan cho nguoi dung
     * @param error     loi neu co
     * @param minLength do dai toi thieu cua chuoi
     * @param maxLength do dai toi da cua chuoi
     * @return tra ve so int
     **/
    public static String StringHelper(String mes, String error, int minLength, int maxLength) {
        System.out.print(mes);
        String output = sc.nextLine();
        if (output.trim().length() <= minLength) {
            System.out.println(error);
            return StringHelper(mes, error, minLength, maxLength);
        }
        if (output.trim().length() > maxLength) {
            System.out.println(error);
            return StringHelper(mes, error, minLength, maxLength);
        }
        return output;
    }

}

