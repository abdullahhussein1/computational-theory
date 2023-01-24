import java.util.Scanner;

public class NFA4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input String:");
        String string = scanner.next().toLowerCase();
        //ئەگەر ئەنجام true گەڕایەوە پرنتی Accepted بکا
        //سترینگەکە و ژمارە سفر بۆ ستەیتی سەرەتا دەنێرین بۆی لەو ئیندێکسەوە پیت پیت سترینگەکە بخوێنێتەوە
        if (q0(string, 0)){
            System.out.println("Accepted");
        }else{
            //ئەگەر ئەنجام false گەڕایەوە پرنتی Not accepted بکا
            System.out.println("Not accepted!");
        }

    }

    static boolean q0(String string ,int index){
        if (string.length()== index){
            //کە لێرە تەواو بوو false بگەڕێتەوە
            return false;
        }
        //ئەگەر پیتی ئەم ستەیتە یەکسان بوو بە a مەرجەکە جێبەجێ دەبێ
        if (string.charAt(index)=='a'){
            //نرخی دواتر هەم لەخۆی بداتەوە و هەم بچێتە ستەیتی دوای خۆی
            //ئەگەر یەکێک لەو دوانە true بن هەر ئەنجام بە true بگەڕێتەوە
            return (q0(string, index +1) || q1(string, index +1));
        }
        //ئەگەر مەرجەکە جێبەجێ نەبوو(نرخەکە a نەبوو)، واتا نرخەکە b یە بۆیە پێویست بە else ناکات
        return q0(string, index +1);
    }

    static boolean q1(String string ,int index){
        if (string.length()== index){
            //کە لێرە تەواو بوو false بگەڕێتەوە
            return false;
        }
        //ئەگەر پیتی ئەم ستەیتە یەکسان بوو بە b دەچێتە q2
        if (string.charAt(index)=='b'){
            return q2(string, index +1);
        }
        //ئەگەر مەرجەکە جێبەجێ نەبوو(نرخەکە b نەبوو لە q1 بۆ q2)، سیستەمەکە سترینگەکەی قبوڵ نەکات
        return false;
    }

    static boolean q2(String string ,int index){
        if (string.length()== index){
            //کە لێرە تەواو بوو false بگەڕێتەوە
            return false;
        }
        //ئەگەر پیتی ئەم ستەیتە یەکسان بوو بە b دەچێتە q3
        if (string.charAt(index)=='b'){
            return q3(string, index +1);
        }

        //ئەگەر مەرجەکە جێبەجێ نەبوو(نرخەکە b نەبوو لە q2 بۆ q3)، سیستەمەکە سترینگەکەی قبوڵ نەکات
        return false;
    }

    static boolean q3(String string ,int index){
        if (string.length()== index){
            //کە لێرە تەواو بوو true بگەڕێتەوە
            return true;
        }
        //دەگەڕێتەوە بۆ خۆی جا ئینپوتەکە هەر چییەک بێ
        return q3(string, index +1);
    }
}
