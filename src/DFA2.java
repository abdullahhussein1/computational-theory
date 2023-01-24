import java.util.Scanner;

public class DFA2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("<Starts with 'aa' or 'bb'>");
        System.out.print("input String(contains a & b):");

        while(!scanner.hasNext("[a-bA-b]+")){
            System.err.println("wrong input!");
            System.out.println();
            System.out.print("Input string:");
            scanner.next();
        }

        String string = scanner.next().toLowerCase();
        if (q0(string, 0)){
            System.out.println("Accepted");
        }else{
            System.err.println("Not accepted!");
        }

    }

    static boolean q0(String string ,int i){
        if (string.length()==i){
            return false;
        }

        if (string.charAt(i)=='a'){
            return q1(string, i+1);
        }

        return q2(string, i+1);
    }

    static boolean q1(String string ,int i){
        if (string.length()==i){
            return false;
        }

        if (string.charAt(i)=='a'){
            return q3(string, i+1);
        }

        return q4(string, i+1);
    }

    static boolean q2(String string ,int i){
        if (string.length()==i){
            return false;
        }

        if (string.charAt(i)=='b'){
            return q3(string, i+1);
        }

        return q4(string, i+1);
    }

    static boolean q3(String string ,int i){
        if (string.length()==i){
            return true;
        }

        return q3(string, i+1);
    }

    static boolean q4(String string ,int i){
        if (string.length()==i){
            return false;
        }

        return q4(string, i+1);
    }
}
