package capitulo6.lab3;

public
class Aluno {
    private String nome;
    public static int contadorDeAlunos;

    public
    String getNome ( ) {
        return nome;
    }

    public
    void setNome (String nome) {
        this.nome = nome;
        Aluno.contadorDeAlunos++;
    }

    public String imprimeAluno() {
        return "Aluno: " + this.getNome() + "\n" +
               "Contagem no objeto " + this.getNome() + ": " + Aluno.contadorDeAlunos;
    }
}
