public class Alunos {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Pedro", 464654, 5, 6, 7);
        Aluno aluno2 = new Aluno("Joao", 40028922, 10, 10, 2);

        System.out.println(aluno1.nome +" "+ aluno1.matricula + " " + aluno1.nota1 + " " + aluno1.nota2 + " " + aluno1.notatrab);
        aluno1.verificarSituacao();
        System.out.println();

        System.out.println(aluno2.nome +" "+ aluno2.matricula + " " + aluno2.nota1 + " " + aluno2.nota2 + " " + aluno2.notatrab);
        aluno2.verificarSituacao();
    }
    
}
