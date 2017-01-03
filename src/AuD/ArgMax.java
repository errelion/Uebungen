package AuD;

/**
 * Created by Benjamin Fani Sani on 19.10.16.
 */

public class ArgMax {

    public static int max2(int[] list){
        int maxF=list[0];
        int maxS=list[0];
        boolean sIsSet=false;

        for (int i=0; i<list.length; i++){
            if (list[i]>maxS&&!sIsSet){
                maxS=list[i];
                sIsSet=true;
            }
            else if (list[i]>maxF){
                maxS=maxF;
                maxF=list[i];
            }
            else if (list[i]>maxS&&list[i]!=maxF){
                maxS=list[i];
            }
        }

        return maxS;
    }

    public static void main (String[] args){
        int[] list={1,2,3,7,4,5,5,5,5,6,6,6,6};
        System.out.println(max2(list));
    }
}