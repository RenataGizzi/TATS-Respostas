package atividade03;

public class Proposta {
    
    private float total;
    private int numeroParcelas;
    private float valorParcela;
    
    
    Proposta(float pTotal, int pNumeroParcelas) {
        total = pTotal;
        numeroParcelas = pNumeroParcelas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return total / numeroParcelas;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }
}
