import capitulo3.lab1.Operation;
import capitulo3.lab2.EvenOrOdd;
import capitulo4.lab1.Prime;
import capitulo4.lab2.HowManyDaysInAMonth;
import capitulo4.lab3.WorldCupYears;
import capitulo5.lab1.Employee;
import capitulo5.lab2.carro.Car;
import capitulo5.lab2.carro.Garage;

public
class Main {
    public static
    void main (String[] args) {
        /*
        * Métodos de Calculadora em INT
        * */

        Operation operacao = new Operation(2,5);
        System.out.println("Soma: " + operacao.sum());
        System.out.println("Subtração: " + operacao.subtract());
        System.out.println("Divisão: " + operacao.divide());
        System.out.println("Multiplicação: " + operacao.multiply());



        /*
        * CAPITULO 5


        Employee empregado = new Employee("João", "dos Santos", "Programador", 4000.00);
        System.out.println(empregado.toString() + "\n\n");

        Car jetta = new Car("VW Jetta", 2.3, "vermelho");
        Car renault = new Car("Renault Boxer", 3.8, "branco");

        Garage g = new Garage(jetta, renault);

        System.out.println(g.toString());

        *
         */


        /*
        * INtro POO
        *

        Pessoa joao = new Pessoa();
        Pessoa maria = new Pessoa();

        joao.genero = 'M';
        joao.idade = 44;

        maria.genero = 'F';
        maria.idade = 18;

        joao = maria;




        maria.idade = 37;
        System.out.println("Idade de João é "+ joao.idade);
        */




        /*
        CAPITULO 4
        // Testing the PrimeNumber
        Prime numeroEhPrimo = new Prime(9);
        System.out.println(numeroEhPrimo.toString());

        // Testing the Quantos dias do mês

        HowManyDaysInAMonth mesEscolhido = new HowManyDaysInAMonth("Fevereiro");
        System.out.println(mesEscolhido.toString());

        // Testing ano de Copa
        WorldCupYears anoDeCopa = new WorldCupYears(2020); // Se quiser pode apagar o ano que ele traz o ano corrente
        System.out.println(anoDeCopa.toString());
        */


        /*
        Operation operacao = new Operation(10,20);
        int soma = operacao.sum();
        System.out.println("10 + 20 = " + soma);

        EvenOrOdd par = new EvenOrOdd(6);
        System.out.println(par.toString());
         */

    }
}
