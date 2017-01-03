package AuD;

/**
 * Created by Benjamin Fani Sani on 31.10.16.
 */
public class Mergesort {

    public static void mergeSort (int[] list, int lowIndex, int highIndex) {
        if (lowIndex<highIndex){
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(list, lowIndex, midIndex);
            mergeSort(list, midIndex + 1, highIndex);
            merge(list, lowIndex, midIndex, highIndex);
        }
    }

    public static void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
        int[] left = new int[midIndex - lowIndex + 1];

        for (int i = lowIndex; i <= midIndex; i++) {
            left[i - lowIndex] = list[i];
        }

        int[] right = new int[highIndex - midIndex];

        for (int i = midIndex + 1; i <= highIndex; i++) {
            right[i - midIndex - 1] = list[i];
        }

        int iL = 0, iR = 0;

        for (int i=0; i<list.length; i++){
            if (iL<left.length&&((iR> right.length)||(left[iL]<=right[iR]))){
                list[i]=left[iL];
                iL++;
            }else{
                list[i]=right[iR];
                iR++;
            }
        }

        /*
        for (int k = lowIndex; k <= highIndex; k++) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            }
            else {
                list[k] = R[j];
                j++;
            }
        }*/
    }

    public static void main(String[] args){

        int size= 7;
        int[] list=new int[size];

        for (int i=0; i<list.length; i++){
            list[i]=(int)(Math.random()*100);
        }

        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]+"\n");

        mergeSort(list,0,list.length-1);

        for(int i=0; i<list.length-1; i++){
            System.out.print(list[i]+",");
        }

        System.out.print(list[list.length-1]);

    }
}