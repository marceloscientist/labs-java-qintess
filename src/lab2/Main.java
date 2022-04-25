package lab2;

import lab2.a.Prime;
import lab2.b.HowManyDaysInAMonth;
import lab2.c.WorldCupYears;

import java.time.Year;

public
class Main {
    public static
    void main (String[] args) {
        // Testing the PrimeNumber
        Prime numeroEhPrimo = new Prime(18);
        System.out.println(numeroEhPrimo.toString());

        // Testing the Quantos dias do mês
        HowManyDaysInAMonth mesEscolhido = new HowManyDaysInAMonth("Fevereiro");
        System.out.println(mesEscolhido.toString());

        // Testing ano de Copa
        WorldCupYears anoDeCopa = new WorldCupYears(2020); // Se quiser pode apagar o ano que ele traz o ano corrente
        System.out.println(anoDeCopa.toString());

    }
}
