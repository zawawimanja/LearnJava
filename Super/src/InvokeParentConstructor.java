
//invoke parent method

public class InvokeParentConstructor  {



    InvokeParentConstructor(){
        System.out.println(" food");

    }



}

class Dog2 extends  InvokeParentConstructor {

   Dog2(){
       //add super automatically as first statement
   //    super();
       System.out.println(" drink");
   }

}

class TestSuper2{

    public  static void main (String []args){

        Dog2 s= new Dog2();

    }
}
