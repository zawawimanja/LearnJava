
//invoke parent method

public class InvokeParentClass {

    String color ="white";

    void eat(){
        System.out.println(" food");
    }

}

class Dog1 extends  InvokeParentClass{

    String color="black";

    void printcolor(){
        System.out.println(color);
    }

    void work(){
        super.eat();
    }

}

class TestSuper1{

    public  static void main (String []args){

        Dog1 s= new Dog1();
        s.work();
    }
}
