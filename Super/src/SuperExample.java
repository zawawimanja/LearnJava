public class SuperExample {

    int rollno1;
    String name;

    
    SuperExample(int rollno1,String name){

        this.rollno1=rollno1;
        this.name= name;
    }
}

class Employee extends SuperExample{


    float salary;

    Employee(int rollno1,String name,float salary){

        super(rollno1,name);
        this.salary=salary;
    }


    void display(){System.out.println(rollno1+" "+name+" "+salary);}
}


class Test5 {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ankit", 45000f);
        e1.display();
    }

}

