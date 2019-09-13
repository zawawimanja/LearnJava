public class InvokeMethod {

    void m(){
        System.out.println("This is m");
    }

    void n(){
        System.out.println("This is n");

        //m();//same like this.m
        this.m();
    }



    public static void main (String [] args){

        InvokeMethod invoke = new InvokeMethod();
        invoke.n();

    }
}
