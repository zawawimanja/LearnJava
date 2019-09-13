public class ConstructorOverloading {


    int id;
    String name;
    int age;

    ConstructorOverloading(int i,String n,int a){

        id=i;
        name= n;
        age = a;
    }


    ConstructorOverloading(int i , String n){

        id=i;
        name= n;
    }

    void display(){
        System.out.println(" "+id+" "+name+""+age);
    }


    public static void main(String [] args){

        //call default constructor
       ConstructorOverloading bike1 = new ConstructorOverloading(1,"Ali");
        ConstructorOverloading bike2 = new ConstructorOverloading(2,"Ahmed",20);

        bike1.display();
        bike2.display();

    }
}
