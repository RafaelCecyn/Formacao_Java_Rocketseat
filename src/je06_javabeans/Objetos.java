package je06_javabeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Jr");
        felipe.setIdade(-1);
        System.out.println(felipe.getNome());
    }
}
