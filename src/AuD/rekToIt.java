package AuD;

/**
 * Created by Benjamin Fani Sani on 03.11.16.
 */
public class rekToIt {

    public static int algo3(int n){
        if (n<=1) return 1;
        else return n*algo3(n-1);
    }

    public static int algo3Itt(int n){
        int res=1;

        for (int i=n; i>=1; i--){
            res*=i;
        }

        return res;
    }

    public static void main(String[] args){

        int value=8;
        System.out.println(algo3(value));
        System.out.println(algo3Itt(value));
    }
}
