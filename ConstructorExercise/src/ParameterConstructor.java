public class ParameterConstructor {

    int id;
    String name;

    ParameterConstructor(int i ,String n){

         id =i;
         name = n;


    }

    void display(){
        System.out.println(" "+id+" "+name);
    }


    public static void main(String [] args){


        ParameterConstructor bike1 = new ParameterConstructor(1,"Najib");

        bike1.display();
    }

}
