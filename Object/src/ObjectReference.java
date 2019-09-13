public class ObjectReference {

     int id;
     String name;


    public static void main(String [] args){


        ObjectOutsideMain bike1 = new ObjectOutsideMain();

        bike1.display();
        bike1.id=1;
        bike1.name="bmx";

        System.out.println(bike1.id );
        System.out.println(bike1.name);
    }
}
