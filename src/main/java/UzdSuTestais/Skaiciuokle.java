package UzdSuTestais;

public class Skaiciuokle {
    private final int a;
    private final int b;

    public Skaiciuokle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sudetis() {
        return a + b;
    }

    public int atimtis() {
        return a - b;
    }

    public int daugyba() {
        return a * b;
    }

    public int dalyba() {
        if (b == 0) {
            throw new ArithmeticException("Dalyba is 0 negalima!");
        }
        return a / b;
    }


}
