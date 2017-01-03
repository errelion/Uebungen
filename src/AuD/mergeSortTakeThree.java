package AuD;

/**
 * Created by Benjamin Fani Sani on 02.11.16.
 */
public class mergeSortTakeThree {

    private static int[] list;
    private static int[] handle;

    public static void mergeSort(int l, int r){

        if(l<r) {

            int m;

            if ((l + r) % 2 == 0) {
                m = (r + l) / 2;
            } else {
                m = ((r + l) / 2) + 1;
            }

            mergeSort(l, m - 1);
            mergeSort(m, r);
            merge(l, m, r);
        }
    }

    public static void merge(int l, int m, int r){
        handle = new int[list.length];

        int iL=l;
        int iR=m;

        for (int i=l; i<=r; i++){
            if (iL<m && ( (iR>r) || (list[iL] <= list[iR] ) ) ){
                handle[i]=list[iL];
                iL=iL+1;
            }else{
                handle[i]=list[iR];
                iR=iR+1;
            }
        }

        for (int i=l; i<=r; i++){
            list[i]=handle[i];
        }
    }


    public static void main(String[] args){

        int size= 10;
        list=new int[size];

        for (int i=0; i<list.length; i++){
            list[i]=(int)(Math.random()*100);
        }

        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]+"\n");

        mergeSort(0,list.length-1);

        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]);

    }

}
