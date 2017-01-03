package AuD;

/**
 * Created by Benjamin Fani Sani on 25.10.16.
 */
public class minAlt {

    public static int[] minAlt(int[] list){

        int i=0;
        int[] counter=new int[2];


        while(i<list.length){
            boolean isMin=true;
            counter[0]++;
            for( int j=0; j<list.length; j++){
                counter[1]++;
                if (list[i]>list[j]){
                    isMin=false;
                    if (j>i) i=j;
                    else i++;
                    break;
                }
            }
            if(isMin) break;
        }
        return counter;
    }

    public static void main(String []args){


        int size=8;

        for(int j=0; j<10000000; j++) {

            int[] list = new int[size];

            for (int i = 0; i < list.length; i++) {
                list[i] = (int) (Math.random() * 100);
            }

            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + ",");
            }
            System.out.println();

            int[] liste = {8, 7, 6, 5, 4, 3, 2, 1};

            int[] counter = minAlt(list);

            if (counter[0]>8||counter[1]>=43) {
                System.out.println("\nCounterOne: " + counter[0]);
                System.out.println("CounterTwo: " + counter[1]);

                break;
            }
        }
    }
}