public class ThisInstanceVariable {

    int rollno;
    String name;
    float fee;

    //if parameter same with instance variable need to use this keyword.
    //if different no need to use this.

    ThisInstanceVariable(int rollno, String name,float fee){

        this.rollno=rollno;
        this.name =name;
        this.fee = fee;

    }

    void display(){

        System.out.println(" "+rollno +" "+name+" "+fee);
    }


    public static void main (String [] args){

        ThisInstanceVariable student = new ThisInstanceVariable (111,"AndroidMalaya",1234f);

        student.display();


    }


}
