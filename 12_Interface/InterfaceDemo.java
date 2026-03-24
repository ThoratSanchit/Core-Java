package Interface;

interface InterfaceExample{
    void print();
    void get();
}


public class InterfaceDemo implements InterfaceExample{

    @Override
    public void print() {
        System.out.println("Print data.");
    }

    @Override
    public void get() {
        System.out.println("Data printed successfull...");
    }
    public static void main(String[] args) {
        InterfaceExample s=new InterfaceDemo();
        s.get();
        s.print();
    }

  
}
