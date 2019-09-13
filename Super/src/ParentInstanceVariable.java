public class ParentInstanceVariable {

    String color ="white";

}

class Dog extends  ParentInstanceVariable{

    String color="black";

    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }

}

class TestSuper{

    public  static void main (String []args){

       Dog s= new Dog();
        s.printcolor();
    }
}
