public class CopyValueWithoutConstruct {



    int id;
    String name;


    CopyValueWithoutConstruct(int i ,String n){

        id = i;
        name =  n;
    }

    CopyValueWithoutConstruct(){
    }




    void display(){

            System.out.println(" "+name+""+id);
    }



    public static void main(String [] args){

        //call default constructor
        CopyValueWithoutConstruct bike1 = new   CopyValueWithoutConstruct(1,"Ali");
        CopyValueWithoutConstruct bike2 = new  CopyValueWithoutConstruct();

        bike2.id = bike1.id;
        bike2.name= bike1.name;


        bike1.display();
        bike2.display();

    }
}
