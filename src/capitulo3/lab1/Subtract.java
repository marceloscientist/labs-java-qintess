package capitulo3.lab1;

public
class Subtract extends Operation {
    public
    Subtract (int value1, int value2) {
        super(value1, value2);
    }

    private int subtract() {
        return super.getValue1() - super.getValue2();
    }

    @Override
    public
    String toString ( ) {
        return String.format("A subtração de "+ super.getValue1() + " " + super.getValue2() + " é: "+ this.subtract());
    }

}
