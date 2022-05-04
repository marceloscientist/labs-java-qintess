import capitulo8.utils.lab1.NumberFuncionalities;

public
class Main {

    public static
    void main (String[] args) {
        //CAP8 LABS
        // LAB 1
        System.out.println("===================================================\n");
        int[] numeros = {8, 5, 95, 5};
        int max = NumberFuncionalities.getMax(numeros);
        System.out.println("O número maior da minha lista é: " + max);
        int min = NumberFuncionalities.getMin(numeros);
        System.out.println("O número menor da minha lista é: " + min);

/*
        System.out.println("===================================================\n");
        // LAB 2
        System.out.println("Método subtrair sobrecarregados: ");
        System.out.printf("Chamando a versão de subtrair com dois double: %.1f \n", calc.subtrair(6.1, 3));
        System.out.printf("Chamando a versão de subtrair com 1 double e 1 int: %.1f \n", calc.subtrair(6.2, 2.0));
        System.out.printf("Chamando a versão de subtrair com 1 int e 1 double: %.1f \n", calc.subtrair(6, 3.2));
        System.out.println("===================================================\n");

*/

        /*
        // CAP7
        SignUp desconhecido = new SignUp();
        SignUp claudio = new SignUp("Cladio", "Abreu");
        SignUp lourdes = new SignUp("Lourdes", "Souza", 40);

        System.out.println(desconhecido.toString());
        System.out.println(claudio.toString());
        System.out.println(lourdes.toString());
        */
        // LAB1
        /*CAP6 LABS
        // LAB 1
        System.out.println("===================================================\n");
        Calculadora calc = new Calculadora();
        System.out.println("calc.somar(6, 3) = " + calc.somar(6, 3));
        System.out.println("calc.subtrair(6, 3) = " + calc.subtrair(6, 3));
        System.out.println("calc.multiplicar(6, 3) = " + calc.multiplicar(6, 3));
        System.out.println("calc.dividir((6, 3) = " + calc.dividir(6, 3));

        System.out.println("===================================================\n");
        // LAB 2
        System.out.println("Método subtrair sobrecarregados: ");
        System.out.printf("Chamando a versão de subtrair com dois double: %.1f \n", calc.subtrair(6.1, 3));
        System.out.printf("Chamando a versão de subtrair com 1 double e 1 int: %.1f \n", calc.subtrair(6.2, 2.0));
        System.out.printf("Chamando a versão de subtrair com 1 int e 1 double: %.1f \n", calc.subtrair(6, 3.2));
        System.out.println("===================================================\n");

        // LAB 3
        Aluno joao = new Aluno();
        joao.setNome("João");
        joao.imprimeAluno();

        Aluno maria = new Aluno();
        maria.setNome("Maria");
        maria.imprimeAluno();

        Aluno marco = new Aluno();
        marco.setNome("Marco");
        marco.imprimeAluno();
        System.out.println("Temos "+ Aluno.getContadorDeAlunos() + " alunos ao total.");
        System.out.println("===================================================\n");

        */
        /*
        * Métodos de Calculadora em INT
        *
        Integer valor = 50;
        Divide dividir = new Divide(10,5);
        System.out.println(dividir.toString());

        Multiply multiplicar = new Multiply(10,5);
        System.out.println(multiplicar.toString());

        Subtract subtrair = new Subtract(10,5);
        System.out.println(subtrair.toString());

        Sum somar = new Sum(10,5);
        System.out.println(somar.toString());

*/

        /*
        System.out.println("Soma: " + operacao.sum());
        System.out.println("Subtração: " + operacao.subtract());
        System.out.println("Divisão: " + operacao.divide());
        System.out.println("Multiplicação: " + operacao.multiply());
        */


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
