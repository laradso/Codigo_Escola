public class Main {
    public static void main(String[] args){

        Dados d = new Dados();
        Diretor diretor = new Diretor("Roberto", 30, "MAsculino", 1500.0f);
        d.cadastrarPessoa(diretor);

        Aluno a1 = new Aluno("Victor", 19, "Masculino", 201900, "EngComp");
        Aluno a2 = new Aluno("Marcos", 19, "Masculino", 201901, "EngComp");
        Aluno a3 = new Aluno("Rebeca", 19, "Feminino", 201902, "EngComp");

        d.cadastrarPessoa(a1);
        d.cadastrarPessoa(a2);
        d.cadastrarPessoa(a3);

        Funcionario p1 = new Professor("Vidigal", 31, "Masculino", 5000.0f, "POO");
        Funcionario p2 = new Professor("Mariazinha", 35, "Feminino", 15000.0f, "Calculo");

        d.cadastrarPessoa(p1);
        d.cadastrarPessoa(p2);

        diretor.demitirFuncionario(p2);
        a1.cancelarMatricula();

    }
}
