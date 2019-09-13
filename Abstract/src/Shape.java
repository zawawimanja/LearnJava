abstract class Shape {


    Shape(){

        System.out.println("draw shape");

    }
    abstract  void draw();

    void color(){

        System.out.println("color shape");
    }
}

class  Rectangle extends Shape{

    void draw(){
        System.out.println(" draw rectangle");
    }
}

class  Circle extends Shape{

    void draw(){
        System.out.println(" draw circle");
    }
}

class TestAbstract{

    public  static  void main (String [] args){

        Shape shape = new Circle();

        shape.draw();

        Shape shape1 = new Rectangle();

        shape1.draw();

        shape1.color();
    }
}
