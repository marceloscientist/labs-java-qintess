package capitulo3.lab1;

public
class Operation {
    /***
     * Laborat�rio 1
     A � Somando dois valuees e mostrando o resultado
     1. Crie uma classe e insira a estrutura b�sica de um programa Java;
     2. Declare tr�s vari�veis do tipo int com os nomes value1, value2 e resultado;
     3. Atribua valuees para as vari�veis value1 e value2;
     4. Atribua o resultado da soma das vari�veis value1 e value2 na vari�vel
     resultado;
     5. Imprima o resultado na tela;
     6. Compile e execute o programa.
     O resultado deve ser como o exibido a seguir:
     *
     */
    private int value1;
    private int value2;


    public Operation(int value1, int value2) {
        super();
        this.setValue1(value1);
        this.setValue2(value2);
    }

    public int getValue1() {
        return value1;
    }
    public void setValue1(int value1) {
        this.value1 = value1;
    }
    public int getValue2() {
        return value2;
    }
    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
