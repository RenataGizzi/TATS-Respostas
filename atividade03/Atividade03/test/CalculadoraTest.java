import atividade03.Proposta;
import atividade03.Calculadora;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testeLimite1000() throws Exception {
        Calculadora c = new Calculadora();
        List<Proposta> propostas = c.calcular(500.00f, 800.00f);
        
        assertEquals(2, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);

        assertEquals(1600f, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(800f, p1.getValorParcela(), 0.01);

        assertEquals(1600f, p2.getTotal(), 0.01);
        assertEquals(3, p2.getNumeroParcelas());
        assertEquals(533.33f, p2.getValorParcela(), 0.01);
    }
    
    @Test
    public void testeLimite1001a5000() throws Exception {
        Calculadora c = new Calculadora();
        List<Proposta> propostas = c.calcular(2000.00f, 1800.00f);
        
        assertEquals(3, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        Proposta p3 = propostas.get(2);

        assertEquals(2340f, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(1170, p1.getValorParcela(), 0.01);

        assertEquals(2700f, p2.getTotal(), 0.01);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(675f, p2.getValorParcela(), 0.01);
        
        assertEquals(2700f, p3.getTotal(), 0.01);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(270f, p3.getValorParcela(), 0.01);
    }
    
    @Test
    public void testeLimite5001() throws Exception {
        Calculadora c = new Calculadora();
        List<Proposta> propostas = c.calcular(25000.00f, 7000.00f);
        
        assertEquals(4, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        Proposta p3 = propostas.get(2);
        Proposta p4 = propostas.get(3);

        assertEquals(7700f, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(3850f, p1.getValorParcela(), 0.01);

        assertEquals(9100f, p2.getTotal(), 0.01);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(2275f, p2.getValorParcela(), 0.01);
        
        assertEquals(9100f, p3.getTotal(), 0.01);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(910f, p3.getValorParcela(), 0.01);
        
        assertEquals(9800f, p4.getTotal(), 0.01);
        assertEquals(20, p4.getNumeroParcelas());
        assertEquals(490f, p4.getValorParcela(), 0.01);
    }

}