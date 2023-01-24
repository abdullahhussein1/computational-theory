import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        Pattern pat = Pattern.compile("^a+");
        Matcher mat = pat.matcher(text);

        while (mat.find())
            System.out.println(mat.group());

    }

}
