package capitulo5.lab2.carro;

public
class Garage {

    private Car passengerCar;
    private Car utilityCar;

    public
    Garage (Car passengerCar, Car utilityCar) {
        this.passengerCar = passengerCar;
        this.utilityCar = utilityCar;
    }

    public
    Car getPassengerCar ( ) {
        return passengerCar;
    }

    public
    void setPassengerCar (Car passengerCar) {
        this.passengerCar = passengerCar;
    }

    public
    Car getUtilityCar ( ) {
        return utilityCar;
    }

    public
    void setUtilityCar (Car utilityCar) {
        this.utilityCar = utilityCar;
    }

    @Override
    public
    String toString ( ) {
        return "Carro de Passeio: \n" +
                passengerCar.toString() +
                "===============================================\n" +
                "Carro Utilitário: \n" +
                utilityCar.toString();
    }
}
