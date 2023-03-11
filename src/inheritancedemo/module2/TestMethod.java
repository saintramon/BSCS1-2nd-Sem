package inheritancedemo.module2;

public class TestMethod {
    public static void main(String[] args) {
        SuperOverride sp;
        sp = new SuperOverride();
        sp.methodTwo(); // calls superclass methodTwo()...
        sp = new SubOverride();
        sp.methodTwo(); // calls subclass methodTwo()... note that the
    }
}
