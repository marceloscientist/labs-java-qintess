package capitulo3.lab1;

public
class Multiply extends  Operation {
    public
    Multiply (int value1, int value2) {
        super(value1, value2);
    }

    private int multiply() {
        return super.getValue1() * super.getValue2();
    }

    @Override
    public
    String toString ( ) {
        return String.format("A multiplicação de "+ super.getValue1() + " " + super.getValue2() + " é: "+ this.multiply());
    }
}
