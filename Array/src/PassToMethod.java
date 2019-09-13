public class PassToMethod {


    static void min(int array[]){


        for(int a:array){
            System.out.println(" "+a);
        }
    }



    public static void main (String []args){

       int a []={100,200,300};
       min(a);

    }
}
