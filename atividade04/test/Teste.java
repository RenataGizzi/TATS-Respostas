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
    @Test
        public void Desenvolvedor2mil() {
        Funcionario c = new Funcionario();
        c.setNome("Astolfo");
        c.setEmail("astolfinho@gmail.com");
        c.setSalarioBase(2000f);
        c.setCargo("desenvolvedor");
        float salarioFinal = c.pressionarBotaoCalcular();
        assertEquals(1800f, salarioFinal, 0.01);
    }
    
    
    @Test
    public void TodosCamposVazios() {
        Funcionario c = new Funcionario();
        c.setNome(" ");
        c.setEmail(" ");
        c.setSalarioBase(0f);
        c.setCargo(" ");
        float salarioFinal = c.pressionarBotaoCalcular();
        assertEquals("Nome vazio! Informe um nome válido.\n" + "E-mail vazio! Informe um e-mail válido.\n" + "Salário inválido. Informe um salário maior que zero.\n" + "Cargo vazio. Informe um cargo válido.\n", c.getMsgErro());
    }
    @Test
    public void Cargo() {
        Funcionario c = new Funcionario();
        c.setNome("Astolfo");
        c.setEmail("astolfinho@gmail.com");
        c.setSalarioBase(5000f);
        c.setCargo("jbkb");
        float salarioFinal = c.pressionarBotaoCalcular();
        assertEquals("Cargo inválido. Informe um cargo válido.\n", c.getMsgErro());
    }
}
