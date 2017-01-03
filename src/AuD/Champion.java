package AuD;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
/**
 * Created by Benjamin Fani Sani on 25.10.16.
 */
public class Champion {
    public static boolean champ(int[][] table){

        for(int i=0; i<table.length; i++){
            boolean champion=true;

            for (int j=0; j<table.length; j++){
                if (i==j) continue;
                else if (table[i][j]==0){
                    champion=false;
                    break;
                }
            }

            if (champion) return true;
        }

        return false;
    }

    public static boolean champImprovedII(int[][] table){

        boolean[] check=new boolean[table.length];

        for(int i=0; i<check.length; i++){
            check[i]=true;
        }

        for(int i=0; i<table.length; i++){
            boolean champion=true;

            if(check[i]){

                for (int j=0; j<table.length; j++){
                    if (i==j) continue;
                    else if (table[i][j]==0) {
                        champion = false;
                        break;
                    }
                    else check[j]=false;
                }

                if (champion) return true;
            }
        }

        return false;
    }

    public static int[][] createTable(int players, boolean isChamp, int winner){

        int[][] table= new int[players][players];
        for (int i = 0; i < players; i++) {
            for (int j = i+1; j < players; j++) {
                if (Math.random() > 0.5) {
                    table[i][j] = 1;
                    table[j][i] = 0;
                }
                else {
                    table[i][j] = 0;
                    table[j][i] = 1;
                }
            }
        }

        if(isChamp) {
            for (int i = 0; i < players; i++) {
                table[winner][i] = 1;
                table[i][winner] = 0;
            }
        }

        return table;
    }


    public static void main(String[] args){

        //Settings

        int players=10;
        boolean manInput=false;
        boolean isChamp=true;
        boolean champIsRandom=true;
        boolean print=true;
        boolean isLoop=false;
        int loops=100;
        int winner=players-(players/10);





        if(champIsRandom) {
            if(isLoop){
                winner=(int)(Math.random()*loops);
            }else winner=(int)(Math.random()*10);
        }


        if(manInput) {

            int[][] table= new int[players][players];

            System.out.println("Eingabe");
            for (int i = 0; i < players; i++) {
                for (int j = 0; j < players; j++) {
                    if (i == j) continue;
                    Scanner sc = new Scanner(System.in);
                    table[i][j] = sc.nextInt();
                }
            }
        }else {

            if (isLoop) {

                long[] durationsOne=new long[loops];
                long[] durationsTwo=new long[loops];

                for(int l=0; l<loops; l++) {

                    double perc=((double)(l+1)/(double)(loops))*100;
                    System.out.println(perc+"%");

                    int[][] table=createTable(players,isChamp,winner);

                    long startTime = System.nanoTime();
                    champ(table);
                    long stopTime = System.nanoTime();

                    durationsOne[l]=stopTime-startTime;

                    long startTimeTwo = System.nanoTime();
                    champImprovedII(table);
                    long stopTimeTwo = System.nanoTime();

                    durationsTwo[l]= stopTimeTwo-startTimeTwo;
                }

                long avgOne=0;
                long avgTwo=0;

                for (int i=0; i<loops; i++){
                    avgOne+=durationsOne[i];
                    avgTwo+=durationsTwo[i];
                }

                System.out.println("Durchschnittliche Dauer I: "+((double)avgOne)/(double)(loops));
                System.out.println("Durchschnittliche Dauer II: "+((double)avgTwo)/(double)(loops));

            } else {

                int[][] table= createTable(players,isChamp,winner);
                if (print) {
                    for (int i = 0; i < players; i++) {
                        for (int j = 0; j < players; j++) {
                            if (i == j) {
                                System.out.print("\\ ");
                                continue;
                            }
                            System.out.print(table[i][j] + " ");
                        }
                        System.out.println();
                    }
                }

                System.out.println("Start");

                long startTime = System.nanoTime();
                System.out.println(champ(table));
                long stopTime = System.nanoTime();

                System.out.println("Stop");
                System.out.println("\nRuntime ChampI: " + (double) (stopTime - startTime));
                System.out.println("");

                System.out.println("Start");

                long startTimeTwo = System.nanoTime();
                System.out.println(champImprovedII(table));
                long stopTimeTwo = System.nanoTime();

                System.out.println("Stop");
                System.out.println("\nRuntime ChampII: " + (double) (stopTimeTwo - startTimeTwo));
            }
        }
    }
}