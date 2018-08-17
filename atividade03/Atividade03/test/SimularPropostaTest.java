import atividade03.MostrarPropostasPM;
import atividade03.SimularPropostasPM;
import atividade03.Calculadora;
import atividade03.Proposta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renat
 */
public class SimularPropostaTest {
    @Test
    public void TodosCamposVazios() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("");
        pm.setSalario(0.0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(0.0f);
        pm.pressionarBotaoElaborar();
        assertEquals("nome vazio\nSalario vazio\nidade vazia\n", pm.getMsgErro());
    }
    
    @Test
    public void TestIdadeVazia() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("Joao Da Silva");
        pm.setSalario(1000.0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(500.0f);
        assertNull (pm.pressionarBotaoElaborar());
        assertEquals("nome vazio\n", pm.getMsgErro());
    }
    
     @Test
    public void TestDadosCorretos() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("Joao Da Silva");
        pm.setSalario(800.0f);
        pm.setIdade(25);
        pm.setValorDoEmprestimo(1000.0f);
        MostrarPropostasPM mostrarpm = pm.pressionarBotaoElaborar();
        assertEquals("", pm.getMsgErro());
        assertEquals(2, mostrarpm.getPropostas().size());
    }
    
    @Test
    public void TestIdadeInvalida() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("Joao Da Silva");
        pm.setSalario(1000.0f);
        pm.setIdade(15);
        pm.setValorDoEmprestimo(500.0f);
        assertNull (pm.pressionarBotaoElaborar());
        assertEquals("idade invalida\n", pm.getMsgErro());
    }

}
