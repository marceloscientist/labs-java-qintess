package lab1;

import lab1.a.Operation;
import lab1.b.EvenOrOdd;

public
class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Operation operacao = new Operation(10,20);
        int soma = operacao.sum();
        System.out.println("10 + 20 = " + soma);

        EvenOrOdd par = new EvenOrOdd(6);
        System.out.println(par.toString());
    }
}
