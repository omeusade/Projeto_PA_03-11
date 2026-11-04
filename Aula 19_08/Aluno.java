package exemplo3;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            System.out.println("Erro! Idade invalida");
        } else {
            this.idade = idade;
            System.out.println("Idade cadastrada");
        }
    }
}
