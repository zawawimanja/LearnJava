public class StaticMethod {

        //implementation of static variable

        int rollno;
        String name;
        static String college = "uitm";

        //static method to change variable
        //can use only if variable is static
        static void change(){
            college="UM";
        }

    StaticMethod(int r, String n) {

            rollno = r;
            name = n;
        }


        void display() {
            System.out.println(" "+name +" "+ rollno +" "+ college);
        }



        public static void main(String[] args) {

            //call change method
            StaticMethod.change();


            StaticMethod s1=new StaticMethod(1,"Ahmad");
            StaticMethod s2= new StaticMethod(2,"Ali");

            s1.display();
            s2.display();



        }





}
