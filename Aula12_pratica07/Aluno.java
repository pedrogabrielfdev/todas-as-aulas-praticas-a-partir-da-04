public class Aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double notatrab;

    public Aluno (String nome, int matricula, double nota1 , double nota2 , double notatrab){

        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notatrab = notatrab;


    }
    double calcularMedia (double nota1 , double nota2, double notatrab){
        double media;
        media = (this.nota1 + this.nota2 + this.notatrab) /3 ;
        return media;
    }
    void verificarSituacao (){
        calcularMedia(nota1, nota2, notatrab);
        if (calcularMedia(nota1, nota2, notatrab)>7)
            System.out.print("APROVADO");
        else
            System.out.print("REPROVADO");



        

    }




    }

   

        

