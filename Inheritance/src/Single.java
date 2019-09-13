public class Single {

    void eat() {
        System.out.println(" Eat");
    }

}

    class Dog extends  Single{

        void bark(){
            System.out.println(" barking");
        }
    }


class TestInheritance{


    public static void main (String [] args){

        Dog dog = new Dog();

        dog.bark();
        dog.eat();
    }

        }