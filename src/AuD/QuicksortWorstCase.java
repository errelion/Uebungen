package AuD;

/**
 * Created by Benjamin Fani Sani on 31.10.16.
 */
public class QuicksortWorstCase {

    public static int count;


    public static void sort(int[] list){
        count=0;
        qSort(list, 0, list.length-1);
    }

    public static void qSort(int[] list, int l, int r){
        if (l<r){
            int m = partitionWorstCase(list, l, r);
            qSort(list, l, m-1);
            qSort(list, m+1, r);
        }
    }


    public static int partitionWorstCase(int[] list, int l, int r){

        int max=0;
        for (int i=0; i<list.length; i++){
            if (list[i]<list[max]){
                max = i;
            }
        }

        int handle=list[r];
        list[r]=list[max];
        list[max]=handle;

        int pivot=list[r];
        int m=l;

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


        for(int j=1; j<=16; j++) {
            int size = (int) Math.pow(2, j);
            int[] list = new int[size];

            for (int i = 0; i < list.length; i++) {
                list[i] = (int) (Math.random() * 100);
            }

            sort(list);

            System.out.println(count);
        }


        /*
        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]+"\n");


        sort(list);


        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.println(list[list.length-1]);



        System.out.println(count); */

    }
}
