package AuD;

/**
 * Created by Benjamin Fani Sani on 25.10.16.
 */
public class RandomTester {
    public static void main(String[] args){

        int rLength=10;
        int loops=1000;
        int steps=1;

        int[] graph=new int[rLength/steps];     //erzeuge Array zur Einordnung der Häufigkeiten

        for (int i=0; i<loops; i++){
            int value=((int)(Math.random()*rLength));

            System.out.println(value);
            for(int j=0; j<loops/steps; j++){
                if ((j*steps<=value)&&(value<(j+1)*steps)) graph[j] ++;
            }
        }

        for(int i=0; i<graph.length; i++){
            System.out.println(i*steps+" - "+((i+1)*steps-1)+": "+graph[i]);
        }

        System.out.println(51/10);
    }
}
