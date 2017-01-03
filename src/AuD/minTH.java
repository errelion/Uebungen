package AuD;

/**
 * Created by Benjamin Fani Sani on 25.10.16.
 */
public class minTH {
    public static int minTH(int[] list){
        if (list.length==1) return list[0];
        if (list.length==2){
            if (list[0]>list[1]) return list[1];
            else return list[0];
        }

        int mid=list.length/2;

        int[] splitOne=new int[mid+1];
        int[] splitTwo=new int[mid];

        for(int i=0; i<mid; i++){
            splitOne[i]=list[i];
            splitTwo[i]=list[i+mid];
        }

        int min=0;
        if (minTH(splitOne)>minTH(splitTwo)) min=minTH(splitTwo);
        else min=minTH(splitOne);
        return min;
    }

    public static int minTHAlt(int[] list){

        if (list.length==1) return list[0];
        int mid=list.length/2;

        int[] splitOne=new int[mid];
        int[] splitTwo=new int[mid+1];

        int index=0;

        for (int i=0; i<=mid; i++){
            splitOne[i]=list[index];
            index++;
        }

        for (int i=0; i<list.length; i++){
            if (index==list.length) break;
            splitTwo[i]=list[index];
            index++;
        }

        if (minTHAlt(splitOne)>minTHAlt(splitTwo)) return minTHAlt(splitTwo);
        else return minTHAlt(splitOne);
    }

    public static void main(String[] args){
        int size=3;
        int[] list=new int[size];

        for (int i=0; i<list.length; i++){
            list[i]=(int)(Math.random()*100);
        }

        list[(size/2)-1]=0;

        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+",");
        }
        System.out.println();


        System.out.println("\nMin: " +minTH(list));
    }
}
