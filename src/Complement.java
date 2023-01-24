import java.util.ArrayList;

public class Complement {

    public static void main(String[] args) {

        int[] setA = {1,2,4};
        int[] setB = {3,4,5,6};
        //creating array for complement of set A complement
        ArrayList<Integer> setAComp = new ArrayList<>();

        boolean isSame =false;
        for (int j : setB){
            for (int i : setA){
                if (j == i) {
                    isSame = true;
                    break;
                }
            }
            if (!isSame){
                setAComp.add(j);
            }
            isSame=false;
        }

        System.out.println(setAComp);

    }



}
