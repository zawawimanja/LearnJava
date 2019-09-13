public class Staticvariable {

    //implementation of static variable

    int rollno;
    String name;
    static String college = "uitm";

    Staticvariable (int r, String n) {

        rollno = r;
        name = n;
    }


    void display() {
        System.out.println(" "+name +" "+ rollno +" "+ college);
    }


}

    class TestStudent{

        public static void main(String[] args) {


            Staticvariable  s1=new Staticvariable (1,"Ahmad");
            Staticvariable   s2= new Staticvariable  (2,"Ali");

            s1.display();
            s2.display();



        }

    }


