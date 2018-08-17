package atividade03;
import atividade03.MostrarPropostasPM;
import atividade03.SimularPropostasPM;
import atividade03.Calculadora;
import atividade03.Proposta;
import java.util.List;

public class MostrarPropostasPM {
    List <Proposta> propostas;
    public MostrarPropostasPM (List<Proposta> pPropostas) {
        propostas = pPropostas;
    }
    
    public List<Proposta> getPropostas() {
        return propostas;
    }
    
}
