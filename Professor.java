public class Professor extends Funcionario {
    //Professor também juntamente como Diretor é uma subclasse de uma sublasse
    //nesse caso é uma sublasse da subclasse Funcionario, e é "neta" e folha também
    private String materia;

    public Professor(){
    }

    public Professor(String nome, int idade, String sexo, float salario, String materia){
        super(nome, idade, sexo, salario);
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }
//métodos getters e setters

    public String toString(){
        return "Professor(a) " + getNome() + " de " + materia + " , idade = " + getIdade() + " anos , sexo = " + getSexo() + ", salario = " + getSalario();

    }
}
