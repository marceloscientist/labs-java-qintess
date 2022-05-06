import java.util.Scanner;

public
class Main {

    private static
    void displayMatrix (int[][] matrix, String resultingMatrix) {
        System.out.println("=========="+resultingMatrix+"==========");
        for(int []line : matrix) {
            for(int cell : line) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static
    void createMatrix (Scanner inPut, int matrixLength, int[][] matrix) {
        for(int i=0; i<matrixLength;i++) {
            for(int j=0;j<matrixLength;j++){
                matrix[i][j]=inPut.nextInt();
            }
        }
    }

    public static
    void main (String[] args) {

        /* DesafioSeisDeMaio */

        Scanner inPut = new Scanner(System.in);
        final int matrixLength = 3;
        int[][] matrixA = new int[matrixLength][matrixLength];
        int[][] matrixB = new int[matrixLength][matrixLength];

        System.out.println("Insira os valores da Matriz A");
        createMatrix(inPut, matrixLength, matrixA);

        System.out.println("Insira os valores da Matriz B");
        createMatrix(inPut, matrixLength, matrixB);

        int[][] matrix = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println("Produto das Matrizes A & B");

        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                for(int k = 0; k < matrixLength; k++) {
                    matrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        displayMatrix(matrixA, "Matriz A");
        displayMatrix(matrixB, "Matriz B");
        displayMatrix(matrix, "Matriz Resultante");
//

/*

 Cada elemento de m1m2 e definido atraves do
somatorio do produto dos elementos da i-esima linha da matriz1 com os respectivos
elementos da j-esima coluna da matriz2.*/

/* Dicas:
 - determinar a ordem da matriz quadrada
 - criar blocos de entrada de dados com Scanner
 - bloco processamento: multiplicando as matrizes de entrada
 - estipular blocos de saida para exibir as matrizes montadas a partir dos dados inseridos pelo
usuario*/


/*
        DesafioCincoDeMaio cincoDeMaio = new DesafioCincoDeMaio();
        cincoDeMaio.criarMatrizDezDezRandomicamente();
        cincoDeMaio.apresentarConteudoEPosicao();
        cincoDeMaio.apresentarMatrizCompleta();
        cincoDeMaio.apresentarSomaTerceiraColuna();


*/



        /*
        //CAP8 LABS
        // LAB 1
        System.out.println("===================================================\n");
        System.out.println("LAB 1\n");


        int[] numeros = {8, 5, 95, 5};
        int max = NumberFuncionalities.getMax(numeros);
        System.out.println("O número maior da minha lista é: " + max);
        int min = NumberFuncionalities.getMin(numeros);
        System.out.println("O número menor da minha lista é: " + min);


        // LAB 2
        System.out.println("===================================================\n");
        System.out.println("LAB 2\n");

        if(args.length > 0) {
            int soma = 0;
            for(String arg : args) {
                soma += Integer.parseInt(arg);
            }
            double media = soma/args.length;
            System.out.printf("A média das idades: \n", args);
            System.out.printf("é de: %.2f", media);

        } else {
            System.out.println("Entre com valores válidos para as idades");
        }

        System.out.println("\n===================================================\n");
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


        /*
        receberArray(new int[] {8,9,2,3});



        int conjunto[][] = {{0, 1, 1,5}, {8, 5, 8}, {9, 5, 4}};
        for(int[] subconjunto : conjunto) {
            for(int elemento: subconjunto) {
                System.out.println(elemento);
            }
        }


    }

    public static void receberArray(int[] arrayQualquer) {
        for(int elemento : arrayQualquer) {
            System.out.println(elemento);
        }
    }
    */
    }



}

