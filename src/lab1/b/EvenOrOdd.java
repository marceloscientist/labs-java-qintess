package lab1.b;

public
class EvenOrOdd {
    /**
     *
     * Laboratório 2
     A – Verificando se um número é par ou ímpar
     1. Crie uma classe e insira a estrutura básica de um programa Java;
     2. Declare uma variável do tipo int com o nome value e atribua um value;
     3. Usando o operador ternário, verifique se o número é par ou ímpar e imprima
     na tela;
     4. Compile e execute o programa.
     O resultado deve ser como o exibido a seguir:
     Par
     *
     *
     */

    private int value;

    public EvenOrOdd(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return (this.getValue() % 2 == 0)? true: false;
    }

    @Override
    public String toString() {
        return this.isEven()? "Par": "Impar";
    }
}
