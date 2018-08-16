import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    @Test
    public void testLimite1000 () {
        Calculadora c =new Calculadora();
        List<Proposta> proposta = c.calcular(800.00f);
        assertEquals(2, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);

        assertEquals(1600f, p1.getTotal(),0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(800f, p1.getValorParcelas(), 0.01);
        
        
        assertEquals(1600f, p2.getTotal(),0.01);
        assertEquals(3, p2.getNumeroParcelas());
        assertEquals(533.33f, p2.getValorParcelas(), 0.01);
    }
    
    @Test
    public void testLimite1001a5000 () {
        Calculadora c =new Calculadora();
        List<Proposta> proposta = c.calcular(1800.00f);
        assertEquals(3, propostas.size());
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        Proposta p3 = propostas.get(2);

        assertEquals(2340f, p1.getTotal(),0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(1170f, p1.getValorParcelas(), 0.01);
        
        
        assertEquals(2700f, p2.getTotal(),0.01);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(f, p2.getValorParcelas(), 0.01);
    }

}
