package MvcServices.lib;

import java.util.Scanner;

public class inputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static int intHelper(String msg , String err) {

        System.out.println(msg);

        int value = 0;
        try {
            value = Integer.parseInt(sc.nextLine());
            return value;
        } catch (Exception e) {
            System.out.println(err);
            return intHelper(msg, err);
        }
    }

    public static String stringHelper(String msg, String err, int minLength, int maxLength) {
        System.out.println(msg);
        String output = sc.nextLine();

        if (output.trim().length() < minLength ) {
            System.out.println(err);
            return stringHelper(msg, err, minLength, maxLength);
        }
        else if (output.trim().length() > maxLength ){
            System.out.println(err);
            return stringHelper(msg, err, minLength, maxLength);
        }
        return output;
    }
}
