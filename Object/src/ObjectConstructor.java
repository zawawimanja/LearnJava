public class ObjectConstructor {



    int id;
    String name;

    ObjectConstructor(int i , String n){
        id = i;
        name = n ;

        System.out.println(" "+id +" "+name);
    }

    public static void main(String [] args){


        ObjectConstructor bike1 = new ObjectConstructor(10,"Abu");


    }
}
