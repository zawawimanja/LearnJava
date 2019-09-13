

class PassConstructor{

    A4 obj;
    PassConstructor(A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of A4 class
    }
}

class A4{
    int data=10;
    A4(){
        PassConstructor b=new PassConstructor(this);
        b.display();
    }
    public static void main(String args[]){
        A4 a=new A4();
    }
}