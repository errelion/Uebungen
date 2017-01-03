package AuD;

/**
 * Created by Benjamin Fani Sani on 31.10.16.
 */
public class Tester {


    public static int fak(int n){
        int res=1;

        for (int i=n; i>0; i--){
            res*=i;
        }

        return res;
    }

    public static void main(String[] args){
        System.out.println(fak(5));
    }
}
