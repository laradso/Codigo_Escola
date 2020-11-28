public class Diretor extends Funcionario {
    //Diretor é extendido de Funcionario , que é uma subclasse de Pessoa, 
    //então Diretor é uma subclasse da subclasse ("neta"), e é chamado de folha da herança também.
    //Classe pobre pois tem os mesmos atributos de sua "Mãe"
    private Dados dados;

    public Diretor(){
    }

    public Diretor(String nome, int idade, String sexo, float salario){
        super(nome, idade, nome, salario);
        dados = new Dados();
    }

    public Dados getDados(){
        return dados;
    }

    public void demitirFuncionario(Funcionario f){
        System.out.println("O funcionário " + f.getNome() + " foi demitido pelo diretor!");
    }

    public void cancelarMatricula(Aluno a){
        System.out.println(a.getNome() + " cancelou a matricula!");
    }

    public String toString(){
        return "Diretor(a) " + getNome() + " , idade = " + getIdade() + " anos , sexo = " + getSexo();

    }
}
