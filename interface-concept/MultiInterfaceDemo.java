interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionPrinter implements Printable, Scannable {
    public void print() { System.out.println("Printing..."); }
    public void scan()  { System.out.println("Scanning..."); }
}

public class MultiInterfaceDemo {
    public static void main(String[] args) {
        MultiFunctionPrinter m = new MultiFunctionPrinter();
        m.print();
        m.scan();
    }
}
