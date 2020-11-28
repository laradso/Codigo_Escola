import java.util.ArrayList;
import java.util.List;

public class Dados implements IDados{
    private ArrayList<Aluno> dadosALUNOS = new ArrayList<Aluno>();
    private ArrayList<Professor> dadosPROFESSORES = new ArrayList<Professor>();
    private ArrayList<Diretor> dadosDIRETORES = new ArrayList<Diretor>();

    public Dados(){
    }

    public List<Aluno> getDadosALUNOS(){
        return dadosALUNOS;
    }

    public List<Professor> getDadosPROFESSORES(){
        return dadosPROFESSORES;
    }

    public List<Diretor> getDadosDIRETORES(){
        return dadosDIRETORES;
    }

    @Override
    public void cadastrarPessoa(Pessoa p){
        if (p instanceof Aluno){
            System.out.println("[ALUNO]" + p.getNome() + " foi cadastrado(a)!");
            dadosALUNOS.add((Aluno)p);
        }
        else if(p instanceof Professor){
            System.out.println("[PROFESSOR]" + p.getNome() + " foi cadastrado(a)!");
            dadosPROFESSORES.add((Professor)p);
        }
        else if (p instanceof Diretor){
            System.out.println("[DIRETOR]" + p.getNome() + " foi cadastrado(a)!");
            dadosDIRETORES.add((Diretor)p);
        }
    }

}
