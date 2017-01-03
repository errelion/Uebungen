package AuD;

/**
 * Created by Benjamin Fani Sani on 31.10.16.
 */
public class mergeSort {

    public static void mSort(int[] list){

        if (list.length>1){
            int m=(list.length/2);

            int[] left=new int[m];
            for (int i=0; i<left.length; i++){
                left[i]=list[i];
            }

            int[] right=new int[list.length-m];
            for (int i=m; i<list.length; i++){
                right[i-m]=list[i];
            }

            mSort(left);
            mSort(right);

            list=merge(left, right);
        }
        return;
    }

    public static int[] merge(int[] left, int[] right){
        int[] handle=new int[left.length+right.length];
        int iL=0;
        int iR=0;
        int iH=0;

        while (iL<left.length&&iR<right.length){
            if (left[iL]<right[iR]){
                handle[iH]=left[iL];
                iL++;
            }else{
                handle[iH]=right[iR];
                iR++;
            }
            iH++;
        }

        while (iL<left.length){
            handle[iH]=left[iL];
            iL++;
            iH++;
        }
        while (iR<right.length){
            handle[iH]=right[iR];
            iR++;
            iH++;
        }

        return handle;
    }

    public static void main(String[] args){

        int size= 4;
        int[] list=new int[size];

        for (int i=0; i<list.length; i++){
            list[i]=(int)(Math.random()*100);
        }

        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]+"\n");

        mSort(list);

        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]);

    }
}
