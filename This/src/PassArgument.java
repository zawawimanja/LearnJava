public class PassArgument {


    void m2(PassArgument obj){
        System.out.println("method is invoked");
    }

    void p(){
        //pass argument to method
        m2(this);
    }

    public static void main (String[]args){

        PassArgument s = new PassArgument();
        s.p();
    }
}
