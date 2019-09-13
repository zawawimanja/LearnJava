public class Array1D {

    public static void main (String []args){

       int array [] =new int[3];
	   
	   //can also declare & instation like this
	   //int array [] =new int []{10,20,30};

       array[0]=10;
        array[1]=20;
        array[2]=30;

        //using foreach
        for(int loop:array){
            System.out.println(" "+loop);
        }
    }
}

 class Array1D2 {

    public static void main (String []args){

        int array [] ={10,20,30};

        //using foreach
        for(int loop:array){
            System.out.println(" "+loop);
        }
    }
}



