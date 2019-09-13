public class AnonymousArray {

    static void min(int array[]){


        for(int a:array){
            System.out.println(" "+a);
        }
    }



    public static void main (String []args){

        //no need to declare
      min(new int[]{10,20,30});

    }
}
