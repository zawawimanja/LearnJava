public class ObjectOutsideMain {


    int id;
    String name;

    void display() {

        System.out.println("Object created");
    }


}

 class Main{

    public static void main(String [] args){


        ObjectOutsideMain bike1 = new ObjectOutsideMain();

        bike1.display();
        System.out.println(bike1.id );
        System.out.println(bike1.name);
    }
}
