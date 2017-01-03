package AuD;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Benjamin Fani Sani on 02.11.16.
 */
public class mergeSortTakeTwo {

    private static int counter;

    public static void sort(int[] list){
        counter=0;
        mergeSort(list,0,list.length-1);
    }

    public static void mergeSort(int[] list, int l, int r) {

        if (l<r) {

            int m;

            if ((l + r) % 2 == 0) {
                m = (r + l) / 2;
            } else {
                m = ((r + l) / 2) + 1;
            }

            mergeSort(list, l, m-1);
            mergeSort(list, m, r);
            merge(list, m, l, r);
        }
    }

    public static void merge(int[] list, int m, int l, int r ){

        int[] handle = new int[list.length];
        int iL=l;
        int iR=m;

        for (int i=l; i<=r; i++){
            counter++;
            if (iL<m && ((iR > r) || (list[iL]<=list[iR]) )){
                handle[i]=list[iL++];
            }else{
                handle[i]=list[iR++];
            }
        }

        for (int i=l; i<=r; i++){
            list[i]=handle[i];
        }
    }

    public static void main(String[] args){


        int size= 15;
        int[] list= new int[size];

        for (int i=0; i<list.length; i++){
            list[i]=(int)(Math.random()*100);
            System.out.print(list[i]+" ");
        }

        System.out.println();
        sort(list);

        for (int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }




    }
}
