import java.util.Scanner;

public class NFA1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("I will accept strings starts with 'ab'");
        System.out.println("The string should contain a & b, not any other letter!");
        System.out.print("Enter string:");
        while(!scanner.hasNext("[a-bA-B]+")){
            System.err.println("Wrong input!(just a & b)");
            System.out.println();
            System.out.print("Enter string:");
            scanner.next();
        }
        String string = scanner.next().toLowerCase();
        if (q0(string, 0)){
            System.out.println("Accepted!");
        }else {
            System.err.println("Not accepted!");
        }

    }

    static boolean q0(String string, int i) {
        if (string.length()==i) {
            return false;
        }
        if (string.charAt(i)=='a'){
            return q1(string,i+1);
        }

        return false;
    }

    static boolean q1(String string, int i) {
        if (string.length()==i) {
            return false;
        }
        if (string.charAt(i)=='b'){
            return q2(string,i+1);
        }

        return false;
    }

    static boolean q2(String string, int i) {
        if (string.length()==i) {
            return true;
        }

        return q2(string,i+1);
    }
}
