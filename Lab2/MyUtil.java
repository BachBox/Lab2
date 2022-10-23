package Lab2;

import java.util.Scanner;

public class MyUtil {

    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger() {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Wrong type, input again");
            }
        }
    }

    public static double getADouble() {
        double x;
        while (true) {
            try {
                x = Double.parseDouble(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("Wrong type, input again");
            }
        }
    }

}
