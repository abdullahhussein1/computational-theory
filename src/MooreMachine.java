import java.util.Scanner;

public class MooreMachine {
    //print 1 after abb
    static String output = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        while (!scanner.hasNext("[a-bA-B]+")) {
            System.err.println("wrong input!(Enter only a & b)");
            System.out.println();
            System.out.print("Enter text: ");
            scanner.next();
        }
        String text = scanner.next().toLowerCase();
        q0(text, 0);

    }

    static void q0(String text, int i) {
        output += "0";

        if (text.length() == i) {
            System.out.println(output);
            return;
        }

        if (text.charAt(i) == 'a') {
            q1(text, i + 1);
        } else {
            q0(text, i + 1);
        }
    }

    static void q1(String text, int i) {
        output += "0";

        if (text.length() == i) {
            System.out.println(output);
            return;
        }

        if (text.charAt(i) == 'a') {
            q1(text, i + 1);
        } else {
            q2(text, i + 1);
        }
    }

    static void q2(String text, int i) {
        output += "0";

        if (text.length() == i) {
            System.out.println(output);
            return;
        }

        if (text.charAt(i) == 'a') {
            q1(text, i + 1);
        } else {
            q3(text, i + 1);
        }
    }

    static void q3(String text, int i) {
        output += "1";

        if (text.length() == i) {
            System.out.println(output);
            return;
        }

        if (text.charAt(i) == 'a') {
            q1(text, i + 1);
        } else {
            q0(text, i + 1);
        }
    }

}
