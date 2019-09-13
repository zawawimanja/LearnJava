public class Multilevel {


    void weeping(){

        System.out.println(" weeping");
    }
}

class Dog1 extends Multilevel{


    void barking(){

        System.out.println("barking");
    }

}

class BabyDog extends Dog1{

     void eating (){
         System.out.println("eating");
     }
}

class TestInheritance2{

    public static void main (String []args){

        BabyDog bd = new BabyDog();

        bd.weeping();
        bd.barking();
        bd.eating();
    }
}
