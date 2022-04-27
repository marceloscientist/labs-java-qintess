package capitulo3.lab1;

public
class Divide extends Operation {
    public
    Divide (int value1, int value2) {
        super(value1, value2);
    }

    private int divide() {
        return super.getValue1() / super.getValue2();
    }

    @Override
    public
    String toString ( ) {
        return String.format("A Divisão de "+ super.getValue1() + " " + super.getValue2() + " é: "+ this.divide());
    }

}
