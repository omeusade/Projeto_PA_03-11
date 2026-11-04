package exemplo3;

public class AlunoTestar {

    public static void main(String[] args) {
        //instanciar a classe aluno
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Tiago");
        aluno2.setNome("Coutinho");

        System.out.println(aluno1.getNome());
        aluno1.setIdade(140);
        System.out.println(aluno2.getNome());
        aluno2.setIdade(32);
    }

}
