package desafios;

import java.util.Arrays;

public
class DesafioCincoDeMaio {

    /***
     *  DESAFIO DO PROFESSOR DIA 05/05/2022
     *
     * */
    private int[][] matrizDezDez = new int[10][10];

    public
    void criarMatrizDezDezRandomicamente ( ) {
        for (int l = 0; l < 10; l++) {
            for(int c = 0; c < 10; c++) {
                this.matrizDezDez[l][c] = (int) (Math.random() * 9)+1;
            }
        }
    }
    public void apresentarConteudoEPosicao() {
        System.out.println("==============  Apresentar conteúdo de cada posição da matriz  =============");

        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                System.out.print("m[" + l + "][" + c + "] = " + matrizDezDez[l][c] + " >> ");
            }
            System.out.println();
        }
    }

    public void apresentarMatrizCompleta() {
        System.out.println();
        System.out.println("================= Apresentar matriz completa ====================");
        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(matrizDezDez[l][c]);
            }
            System.out.println();
        }
    }



    public String apresentarSomaTerceiraColuna() {
        System.out.println();
        System.out.println("=================== Apresentar Terceira Coluna ===================");
        int somaTerceiraColuna = 0;
        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                if (c == 2) {
                    somaTerceiraColuna += matrizDezDez[l][c];
                }
            }
        }
        return "A soma da Terceira coluna é: " + somaTerceiraColuna;
    }

    @Override
    public
    String toString ( ) {
        return apresentarSomaTerceiraColuna();
    }
}
