public class ATM {

    int accno;
    float amount;
    String name;

    void insert(int a,float amt,String n){

        accno = a;
        amount = amt;
        name = n ;
    }

    void deposit(float depo){

        amount+= depo;
    }

    void withdraw(float withdraw){

        if(amount<withdraw){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Withdraw "+withdraw);
        }
    }


    void display(){

        System.out.println("Amount "+amount+" Acc NO "+accno + " Name " +name );
    }

    void checkBalance(){
        System.out.println("Amount "+amount);
    }

    public static void main(String [] args){


       ATM atm = new ATM();
       atm.insert(333,400000," AndroidMalaya");
       atm.display();
       atm.checkBalance();

       atm.deposit(59999);
       atm.display();
       atm.checkBalance();

       atm.withdraw(2000000000);
       atm.display();
       atm.checkBalance();



    }



}
