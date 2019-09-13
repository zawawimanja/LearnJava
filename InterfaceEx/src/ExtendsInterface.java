interface ExtendsInterface {

    void print();
}

interface  Show extends  ExtendsInterface{

    void  show();
}

class TestInterface5 implements Show{
    public  void print(){

        System.out.println(" print");
    }

    public void show(){
        System.out.print("show ");
    }


    public static void main ( String [] args){

        TestInterface5 obj = new TestInterface5();
        obj.print();
        obj.show();
    }
}

