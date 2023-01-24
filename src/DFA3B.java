import java.util.Scanner;

public class DFA3B {

    public static void main(String[] args) {
        //initializing scanner
        Scanner scanner = new Scanner(System.in);
        //start
        System.out.print("Enter a text starts with 1: ");
        //getting input
        int a = 0;
        while (a < 1) {
            String text = scanner.next();
            System.out.println(q0(text, 0));
        }


    }

    static boolean q0(String text, int i) {
        if (text.length() == i) {
            return false;
        }

        if (text.charAt(i) == '0') {
            return q2(text, i + 1);
        } else {
            return q1(text, i + 1);
        }

    }

    static boolean q1(String text, int i) {
        if (text.length() == i) {
            return true;
        }
        return q1(text, i + 1);
    }

    static boolean q2(String text, int i) {
        if (text.length() == i) {
            return false;
        }
        return q2(text, i + 1);
    }

}