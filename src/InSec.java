import java.util.ArrayList;

public class InSec {
    public static void main(String[] args) {

        int[] setA = {1,2,2,3,4,5};
        int[] setB = {2,3,1,1,1,6};

        ArrayList<Integer> interSection = new ArrayList<>();

        boolean isSame=false;
        for (int j : setB) {
            for (int i : setA) {
                if (j==i){
                    isSame=true;
                    break;
                }
            }
            if (isSame){
                interSection.add(j);
            }
            isSame=false;
        }

        System.out.println(interSection);


    }
}
