public class DefaultValue {

    int id;
    String name;

    void display(){

        System.out.println(" "+id+" "+name);
    }


    public static void main(String [] args){


        DefaultValue bike1 = new DefaultValue();

        bike1.display();
    }
}
