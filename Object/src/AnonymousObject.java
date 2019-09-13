public class AnonymousObject {

    int length;
    int width;

    void insert(int l ,int w){

            length=l;
            width = w;

            System.out.println(" "+length * width);


    }

    public static void main(String [] args){


        AnonymousObject bike1 = new  AnonymousObject();
        new AnonymousObject().insert(20,10);

        bike1.insert(10,10);
    }
}
