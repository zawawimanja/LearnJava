interface Drawable {

    void draw();
}

class Rectangle1  implements Drawable{

    public void draw(){
        System.out.println("draw rectangle");
    }
}

class Circle1 implements Drawable{

    public  void draw(){
        System.out.println("draw circle");
    }
}


class TestInterface{

    public static  void main (String [] args){

        Drawable dr = new Circle1();
        dr.draw();


        Drawable dr1 = new Rectangle1();
        dr1.draw();


    }
}



