public class ObjectInMain {


    int id;
    String name;

    void display(){

        System.out.println("Object created");
    }


    public static void main(String [] args){


        ObjectInMain bike1 = new ObjectInMain();

        bike1.display();
       System.out.println(bike1.id );
        System.out.println(bike1.name);
    }
}
