package AuD;

/**
 * Created by Benjamin Fani Sani on 27.10.16.
 */
public class Quicksort {

    public static int count;


    public static void sort(int[] list){
        count=0;
        qSort(list, 0, list.length-1);
    }


    public static void qSort(int[] list, int l, int r){
        if (l<r){
            int m = partition(list, l, r);
            qSort(list, l, m-1);
            qSort(list, m+1, r);
        }
    }


    public static int partition(int[] list, int l, int r){

        int pivot=list[r];

        int m=l;
        int handle;

        for(int i=l; i<r; i++){
            count++;
            if (list[i]<pivot){
                handle=list[i];
                list[i]=list[m];
                list[m]=handle;
                m++;
            }
        }

        handle=list[m];
        list[m]=list[r];
        list[r]=handle;

        return m;
    }


    public static void main(String[] args){

        int[] counter=new int[16];

        for (int k=0; k<100; k++) {
            for (int j = 1; j <= 16; j++) {
                int size = (int) Math.pow(2, j);
                int[] list = new int[size];

                for (int i = 0; i < list.length; i++) {
                    list[i] = (int) (Math.random() * 100);
                }

                sort(list);

                counter[j-1] += count;
            }
        }

        double[] avgCount= new double[16];

        for (int i=0; i<counter.length; i++){
            avgCount[i]+=(double)counter[i]/100;
            System.out.println(avgCount[i]);
        }
    }
}
