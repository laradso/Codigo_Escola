public class Aluno extends Pessoa {
  //Aluno é extendido de Pessoa, logo é uma subclasse dela e também chamada de "filha"
    private int matricula;
    private String curso;

    public Aluno(){
    }

    public Aluno(String nome, int idade, String sexo, int matricula, String curso){
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println("Matrícula de " + getNome() + " foi cancelada");
    }
    
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
//Métodos getters e setters
    public String toString(){
        return "Aluno(a) " + getNome() + " , idade = " + getIdade() + " anos , sexo = " + getSexo();

    }
}
