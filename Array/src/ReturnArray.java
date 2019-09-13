public class ReturnArray {


    static int[] get(){
        return new int[]{10,20,30};
    }


    public static  void main (String []args){

        int a[]=get();

        for(int aa:a){
            System.out.print(" " +aa);
        }

    }

}
