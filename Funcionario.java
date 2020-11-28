public class Funcionario extends Pessoa {
    //Funcionario é extendido de Pessoa, logo é sua subclasse e "filha"
    private float salario;

    public Funcionario(){
    }

    public Funcionario(String nome, int idade, String sexo, float salario){
        super(nome, idade, sexo);
        this.salario = salario;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public void aumentoSalario(float aum){
        this.salario +=aum ;
    }
    //métodos getters e setters
}
