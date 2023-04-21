package MvcServices.base;

import java.util.Scanner;
import java.util.function.Function;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static <T> T inputHelper(String msg, String err, int minLength, int maxLength, Function<String, T> converter) {
        System.out.println(msg);
        String input = sc.nextLine().trim();
        if (input.length() < minLength || input.length() > maxLength) {
            System.out.println(err);
            return inputHelper(msg, err, minLength, maxLength, converter);
        }
        try {
            return converter.apply(input);
        } catch (Exception e) {
            System.out.println(err);
            return inputHelper(msg, err, minLength, maxLength, converter);
        }
    }
}
