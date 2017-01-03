package AuD;

/**
 * Created by Benjamin Fani Sani on 28.10.16.
 */
public class countSort {


    public static int[] countSort (int[] list){

        int max=list[0];
        for (int i=1; i<list.length; i++){
            if (list[i]>max) max=list[i];
        }

        int[] count=new int[max+1];

        for (int i=0; i<list.length; i++){
            count[list[i]]++;
        }

        int[] sortedList = new int[list.length];

        int m=0;
        for (int i=0; i<count.length; i++){
            if (count[i]>0){
                sortedList[m]=i;
                m++;
                count[i]--;
                i--;
            }
        }

        return sortedList;
    }

    public static void main(String[] args){

        int size=15;
        int[] list=new int[size];

        for (int i=0; i<size; i++){
            list[i]=(int)(Math.random()*10);
        }

        for(int i=0; i<list.length-1; i++){
            if (i%20==0) System.out.println("");
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]+"\n");

        list=countSort(list);

        for(int i=0; i<list.length-1; i++){
            if (i%20==0) System.out.println("");
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]);

    }
}