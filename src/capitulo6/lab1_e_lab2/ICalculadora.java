package capitulo6.lab1_e_lab2;

public
interface ICalculadora {
    int somar (int valor1, int valor2);

    int subtrair (int valor1, int valor2);
    double subtrair (double valor1, double valor2);
    double subtrair (int valor1, double valor2);
    double subtrair (double valor1, int valor2);

    int dividir (int valor1, int valor2);
    int multiplicar (int valor1, int valor2);
}

