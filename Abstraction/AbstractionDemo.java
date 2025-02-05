package Abstraction;


abstract class Abs{
    abstract void printMesssage();
}

public class AbstractionDemo extends Abs{

    @Override
    void printMesssage() {
       System.out.println("This is called abstraction method");
    }
    public static void main(String[] args) {
        
    }

 
}
