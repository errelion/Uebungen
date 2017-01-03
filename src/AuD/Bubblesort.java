package AuD;

/**
 * Created by Benjamin Fani Sani on 19.10.16.
 */
public class Bubblesort {

    private static int[] bubbleSort(int[] list){
        int counter=0;
        boolean swapped;
        do{
            swapped=false;
            for (int i=0; i<list.length-1; i++){
                counter++;
                if (list[i]>list[i+1]){
                    int handle=list[i];
                    list[i]=list[i+1];
                    list[i+1]=handle;
                    swapped=true;
                }
            }
        }while (swapped);

        System.out.println(counter);
        return list;
    }

    public static void main(String[] args){
        int bla=1000;
        int[] list={11,10,9,8,7,6,5,4,3,2,1};
        int ind=0;
        /**for (int i=bla; i>0; i--){
            list[ind]=i;
            ind++;
        }*/
        int[] sortedList=bubbleSort(list);

        for (int i=0; i<sortedList.length; i++){
            System.out.print(sortedList[i]+",");
        }
    }
}
