import Maths.Number;

public class Methsdemo {
    public static void main(String[] args) {
        Number a = new Number(10);
        Number b = new Number(3);

        Number sum = a.add(b);
        Number diff = a.subtract(b);

        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());
        System.out.println("a + b = " + sum.getValue());
        System.out.println("a - b = " + diff.getValue());
    }
}
