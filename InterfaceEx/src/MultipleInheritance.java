interface MultipleInheritance {

    void print();
}


interface SHow{

    void print();
}

class TestInterface4 implements MultipleInheritance,SHow{

  public  void print(){
        System.out.println("hello");
    }

    public  static  void main (String [] args){

      TestInterface4 ti = new TestInterface4();
      ti.print();
    }
}