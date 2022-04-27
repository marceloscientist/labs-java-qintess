package capitulo3.lab1;

public
class Sum extends Operation {
    public
    Sum (int value1, int value2) {
        super(value1, value2);
    }

    private int sum() {
        return super.getValue1() + super.getValue2();
    }


    @Override
    public
    String toString ( ) {
        return String.format("A soma de "+ super.getValue1() + " " + super.getValue2() + " é: "+ this.sum());
    }

}
