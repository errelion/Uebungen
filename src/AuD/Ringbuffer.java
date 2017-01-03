package AuD;

/**
 * Created by Benjamin Fani Sani on 07.12.16.
 */
public class Ringbuffer {

    static int begin = 4;
    static int end = 1;

    public static int[] push(int[] list, int n){

        int count=0;
        for (int i=0; i<list.length; i++){
            if (list[i]!=0) count++;
        }

        if (list.length<=count){
            int capacity = list.length*2;
            int[] newarr = new int[capacity];
            int handle = 0;

            if(begin<end){

                for (int i=begin; i<=end; i++){
                    newarr[begin] = list[begin];
                    handle=i;
                }
                newarr[handle] = n;
                end=handle;

            }else{

                for(int i=0; i<list.length-begin; i++){
                    newarr[i+begin+list.length] = list[i+begin];
                }

                for(int i=0; i<=begin; i++){
                    newarr[i] = list[i];
                    handle = i;
                }

                newarr[handle] = n;
                begin=begin+list.length;
                end=handle;
            }

            //list = newarr;

            return newarr;

        }else{
            int it = end;
            it++;
            if (it==list.length) it=0;
            list[it] = n;
            end=it;
            return list;
        }
    }

    public static int pop(int[] list, int begin){
        int it=begin;
        it++;

        int handle=list[begin];

        list[begin] = 0;
        if(begin==list.length-1){
            begin=0;
        }else{
            begin=it;
        }

        return handle;
    }

    public static int randomAccess(int[] list, int i){

        int handle;

        if (i>end){
            handle=list.length-(i-end);
        }else{
            handle=end-i;
        }

        return list[handle];
    }

    public static void main(String[] args) {
        int[] newList = new int[5];
        newList[0] = 3;
        newList[1] = 4;
        newList[3] = 1;
        newList[4] = 2;

        System.out.println(randomAccess(newList,4));

    }
}
