package capitulo6.lab3;

public
class Aluno {
    private String nome;
    private static int contadorDeAlunos;

    public
    String getNome ( ) {
        return nome;
    }

    public
    void setNome (String nome) {
        this.nome = nome;
        Aluno.setContadorDeAlunos();
    }

    private static
    void setContadorDeAlunos () {
        Aluno.contadorDeAlunos++;
    }

    public static
    int getContadorDeAlunos ( ) {
        return Aluno.contadorDeAlunos;
    }

    public void imprimeAluno() {
        System.out.println("Aluno: " + this.getNome() + "\n" +
               "Contagem no objeto " + this.getNome() + ": " + getContadorDeAlunos());
    }
}
