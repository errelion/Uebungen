package AuD;

/**
 * Created by Benjamin Fani Sani on 16.11.16.
 */
public class partialProd {

    public static int[] partialProd(int[] list){
        int[] p = new int[list.length];

        for (int i=0; i<list.length; i++){
            int prod=1;
            for (int j=0; j<=i; j++){
                prod*=list[j];
            }
            p[i]=prod;
        }

        return p;
    }

    public static int[] partialProdLin(int[] list){

        int[] p = new int[list.length];
        p[0]=list[0];

        for(int i=1; i<list.length; i++){
            p[i]=p[i-1]*list[i];
        }

        return p;
    }

    public static void main(String[] args) {
        int[] test = new int[5];

        for (int i=0; i<test.length; i++){
            test[i]=(int)(Math.random()*10);
            System.out.print(test[i]+" ");
        }
        System.out.println("\n");
        int[] pP=partialProd(test);
        int[] pPL=partialProdLin(test);

        for (int i=0; i<pP.length; i++){
            System.out.print(pP[i]+" ");
        }

        System.out.println("\n");

        for(int i=0; i<pPL.length; i++){
            System.out.print(pPL[i]+" ");
        }
    }
}
