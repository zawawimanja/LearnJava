class Aggregation {

    String city,state,country;;


    Aggregation(String city,String state,String country){
        this.city= city;
        this.state= state;
        this.country= country;

    }
}

  class Emp{

    int id;
    String name;
    Aggregation address;


    Emp(int id,String name,Aggregation address){
        this.id= id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main (String [] args){

        Aggregation address1= new Aggregation("KL","KL","Malaysia");

        Aggregation address2= new Aggregation("ALor Star","Kedah","Malaysia");

        Emp emp = new Emp(111,"android",address1);
        Emp emp2 = new Emp(123,"ios",address2);

        emp.display();
        emp2.display();
    }


}
