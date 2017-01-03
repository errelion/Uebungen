package Various;
import java.util.Scanner;
/**
 * Created by Benjamin Fani Sani on 20.10.16.
 */
public class Vergleich {

    public static int fak(int n){
        int res=1;

        for (int i=1; i<=n; i++){
            res=res*i;
        }

        return res;
    }

    public static double nN(int n){
        return Math.pow(n,n);
    }

    public static void main(String[] args){

        while(true) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(fak(n)+"  --  "+nN(n));

            if (n==99) break;
        }
    }
}
