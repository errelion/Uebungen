package AuD;

/**
 * Created by Benjamin Fani Sani on 20.10.16.
 */
public class max2 {

    public static int maxTwo(int[] list){

        int maxF=list[0];
        int maxS=list[0];

        boolean sIsSet = false;

        for (int i=0; i<list.length; i++) {
            if (list[i] < maxF && !sIsSet) {
                maxS = list[i];
                sIsSet = true;
            } else if (list[i] > maxF) {
                int handle = maxF;
                maxF = list[i];
                maxS = handle;
            } else if (list[i] > maxS && list[i] != maxF) {
                maxS = list[i];
            }
        }

        return maxS;
    }


    public static void main(String[] args){

        int[] list={2,3,4,1,2,4,3};

        System.out.println(maxTwo(list));
    }
}
