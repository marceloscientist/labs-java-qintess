package capitulo6.lab1.e.lab2;

public
class Calculadora implements ICalculadora {
    @Override
    public
    int somar (int valor1, int valor2) {
        return valor1 + valor2;
    }

    @Override
    public
    int subtrair (int valor1, int valor2) {
        return valor1 - valor2;
    }

    @Override
    public
    double subtrair (double valor1, double valor2) {
        return valor1 - valor2;
    }

    @Override
    public
    double subtrair (int valor1, double valor2) {
        return valor1 - valor2;
    }

    @Override
    public
    double subtrair (double valor1, int valor2) {
        return valor1 - valor2;
    }

    @Override
    public
    int dividir (int valor1, int valor2) {
        return  valor1 / valor2;
    }

    @Override
    public
    int multiplicar (int valor1, int valor2) {
        return  valor1 * valor2;
    }
}
