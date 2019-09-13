public class ReturnClassInstance {


    //must be non primitive to return
    ReturnClassInstance getA(){
        return this;
    }

    void msg(){
        System.out.println("Hello java");

    }
}


class Test1{

    public  static void main (String [] args){

       new ReturnClassInstance().getA().msg();
    }


}
