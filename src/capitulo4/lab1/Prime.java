package capitulo4.lab1;

public
class Prime {

    private int number;

    public
    int getNumber ( ) {
        return number;
    }

    public
    void setNumber (int number) {
        this.number = number;
    }

    public
    Prime (int number) {
        setNumber(number);
    }

    private boolean isPrime()
    {
        int number = getNumber();

        if(number < 1) {
            System.out.println("Não temos número primos menores do que 1");
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public
    String toString () {
        return this.isPrime() ?
                getNumber() + " é um número primo" :
                getNumber() + " não é um número primo";
    }

}
