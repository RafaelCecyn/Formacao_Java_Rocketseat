package je06_javabeans;

public class Aluno {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0 || idade > 150) {
            throw new IllegalArgumentException("A idade deve ser maior que zero e menor que 150");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
