public class ObjectMethod {

    int id;
    String name;


    void display(int r , String n){

        id = r;
        name = n ;

        System.out.println(" "+id+" "+name);
    }




    public static void main(String [] args){


        ObjectMethod bike1 = new ObjectMethod();

        bike1.display(1,"MountainBike");

    }
}
