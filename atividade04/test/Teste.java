import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import atividade04.CalculoSalario;
import atividade04.Funcionario;

public class Teste {
    
    public Teste() {
    }
    
    @Test
    public void Desenvolvedor5mil() {
        Funcionario c = new Funcionario();
        c.setNome("Astolfo");
        c.setEmail("astolfinho@gmail.com");
        c.setSalarioBase(5000f);
        c.setCargo("desenvolvedor");
        float salarioFinal = c.pressionarBotaoCalcular();
        assertEquals(4000f, salarioFinal, 0.01);
    }
}
