public class CopyValueObject {

    int id;
    String name;


    CopyValueObject(int i,String n){

        id=i;
        name= n;

    }

        //constructor initialize other object
    CopyValueObject(CopyValueObject s){

        id=s.id;
        name= s.name;
    }

    void display(){
        System.out.println(" "+id+" "+name);
    }


    public static void main(String [] args){

        //call default constructor
        CopyValueObject bike1 = new  CopyValueObject(1,"Ali");
        CopyValueObject bike2 = new  CopyValueObject(bike1);

        bike1.display();
        bike2.display();

    }
}
