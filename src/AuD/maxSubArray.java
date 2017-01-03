package AuD;

/**
 * Created by Benjamin Fani Sani on 03.11.16.
 */
public class maxSubArray {

    public static int[] maxSubArray(int[] list){

        int maxCount=list[0];
        int l=0;
        int r=1;

        for(int i=1; i<=list.length; i++){

            for (int j=0; j<list.length && (j+i)<=list.length; j++){

                int counter=0;

                for(int k=j; k<(j+i); k++){
                    counter+=list[k];
                }

                if (counter>maxCount){
                    maxCount=counter;
                    l=j;
                    r=j+i;
                }
            }
        }
        int[] maxSubArray=new int[r-l];
        for (int i=l; i<r; i++){
            maxSubArray[i-l]=list[i];
        }

        return maxSubArray;
    }

    public static int[] maxSubArrayAlt(int[] list){
        int maxSum=list[0];
        int l=0;
        int r=1;

        for(int i=0; i<=list.length; i++){
            int sum=0;
            for(int j=i; j<list.length; j++){
                sum+=list[j];
                if (sum>maxSum) {
                    maxSum=sum;
                    l=i;
                    r=j+1;
                }
            }
        }
        int[] maxSubArray=new int[r-l];

        for (int i=l; i<r; i++){
            maxSubArray[i-l]=list[i];
        }

        return maxSubArray;
    }


    public static int[] maxSubArrayAltBorders(int[] list){
        int maxSum=list[0];
        int l=0;
        int r=1;

        for(int i=0; i<=list.length; i++){
            int sum=0;
            for(int j=i; j<list.length; j++){
                sum+=list[j];
                if (sum>maxSum) {
                    maxSum=sum;
                    l=i;
                    r=j+1;
                }
            }
        }

        int[] borders={l,r-1};

        return borders;
    }


    public static int MSAKadane(int[] list){
        int S=list[0];
        int Send=list[0];

        for(int i=1; i<list.length; i++){
            Send=max(Send+list[i],list[i]);
            S=max(S,Send);
        }

        return S;
    }

    public static int[] MSAKadaneRangeAlt(int[] list){
        int S=list[0];
        int Send=list[0];

        int[] borders={0,0};
        int handle=list[0];

        for(int i=1; i<list.length; i++){
            Send=max(Send+list[i],list[i]);
            S=max(S,Send);
        }

        return borders;
    }

    public static int[] MSAKadaneBorders(int[] list){
        int s=list[0];
        int send=list[0];

        int[] borders={0,0};
        int handle;
        int counter=0;

        for(int i=1; i<list.length; i++){
            send=max(send+list[i],list[i]);
            if (send==list[i]) counter=0;

            handle=s;

            if (send>s) counter++;
            s=max(s,send);

            if (handle!=s){
                borders[1]=i;
                borders[0]=i-counter+1;
            }
        }

        return borders;
    }

    public static int max(int a, int b){
        if(a>b) return a;
        return b;
    }


    public static void main(String[] args){

        int size=10;
        int[] list = new int[size];

        for(int i=0; i<list.length; i++){
            int isNegativ = (int)(Math.random()*10);

            if(isNegativ<5){
                list[i]=(int)(Math.random()*(-70));
            }else{
                list[i]=(int)(Math.random()*10);
            }

            System.out.print(list[i]+" ");
        }

        System.out.println();
        int[] MSA=maxSubArrayAlt(list);
        int[] borders=maxSubArrayAltBorders(list);

        for (int i=0; i<MSA.length; i++){
            System.out.print(MSA[i]+" ");
        }

        System.out.println("\nBorders:");
        System.out.println(borders[0]+" "+borders[1]);

        int[] bordersAlt = MSAKadaneBorders(list);

        System.out.println(bordersAlt[0]+" "+bordersAlt[1]);



        //Produkt

        int MSAProd=0;
        int kadaneProd=0;

        for (int i=0; i<MSA.length; i++){
            MSAProd+=MSA[i];
        }

        for (int i=bordersAlt[0]; i<=bordersAlt[1]; i++){
            kadaneProd+=list[i];
        }

        System.out.println("Produkt:");
        System.out.println(MSAProd+"\n"+kadaneProd);











        int countLminusOne=0;
        int countL=0;
        int countR=0;
        int max=10000000;
        final int quot=max/100;
        System.out.println("Stattest: \n");
        for(int i=0; i<max; i++){
            if(i%quot==0) System.out.println("Progess= "+i/quot+"%");
            //System.out.println();
            int sizeAlt=5;
            int[] listAlt = new int[sizeAlt];

            for(int j=0; j<listAlt.length; j++){
                int isNegativ = (int)(Math.random()*10);

                if(isNegativ<5){
                    listAlt[j]=(int)(Math.random()*(-70));
                }else{
                    listAlt[j]=(int)(Math.random()*10);
                }

                if(listAlt[j]==0) {
                    j--;
                    continue;
                }

                //System.out.print(listAlt[j]+" ");
            }

            //System.out.println();
            if(MSAKadaneBorders(listAlt)[1]!=maxSubArrayAltBorders(listAlt)[1]) countR++;
            if(MSAKadaneBorders(listAlt)[0]!=maxSubArrayAltBorders(listAlt)[0]) {
                countL++;
                if(MSAKadaneBorders(listAlt)[0]+1!=maxSubArrayAltBorders(listAlt)[0]&&MSAKadaneBorders(listAlt)[0]-1!=maxSubArrayAltBorders(listAlt)[0]) countLminusOne++;
            }
        }

        System.out.println(countL);
        System.out.println(countLminusOne);
        System.out.println(countR);

    }
}
