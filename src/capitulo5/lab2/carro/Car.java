package capitulo5.lab2.carro;

public
class Car {

    private String model;
    private double motorPower;
    private String color;

    public
    Car (String model, double motorPower, String color) {
        this.model = model;
        this.motorPower = motorPower;
        this.color = color;
    }

    public
    String getModel ( ) {
        return model;
    }

    public
    void setModel (String model) {
        this.model = model;
    }

    public
    double getMotorPower ( ) {
        return motorPower;
    }

    public
    void setMotorPower (double motorPower) {
        this.motorPower = motorPower;
    }

    public
    String getColor ( ) {
        return color;
    }

    public
    void setColor (String color) {
        this.color = color;
    }

    @Override
    public
    String toString ( ) {
        return "Cor: " + this.getColor() + '\n' +
               "Modelo: " + this.getModel() + '\n' +
               "Potência: " + this.getMotorPower() + '\n';

    }
}
