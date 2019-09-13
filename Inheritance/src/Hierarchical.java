public class Hierarchical {

    void eat(){
        System.out.println(" eating");
    }
}

class Dog2 extends  Hierarchical{

    void bark(){
        System.out.println("barking");
    }
}

class Cat1 extends  Hierarchical{

    void meow(){
        System.out.println("meow");
    }
}

class TestInheritance3{

    public static void main (String []args){

        Cat1 c = new Cat1();
        c.meow();
        c.eat();


        Dog2 dog2 = new Dog2();
        dog2.bark();
    }





}
