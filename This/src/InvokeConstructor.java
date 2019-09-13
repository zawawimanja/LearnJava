public class InvokeConstructor {

    InvokeConstructor(){

        //invoke constructor parameter
        this(5);
        System.out.println("hello invoke cc");


    }

    InvokeConstructor(int x){

        //to invoke constructor
        //this();
        System.out.println(x);
    }

}

class Test{

    public static void main (String []args){

       // InvokeConstructor invoker = new InvokeConstructor(10);
        InvokeConstructor invoker1 = new InvokeConstructor();
    }
}
