package atividade03;

import java.util.List;

public class SimularPropostasPM {
    String nome;
    float salario;
    int idade;
    float valorDoEmprestimo;
    String MsgErro;
    
    public MostrarPropostasPM pressionarBotaoElaborar () {
        validar();
        
        if(MsgErro.equals("")) {
            
        Calculadora c = new Calculadora ();
        List <Proposta> propostas = c.calcular(salario, valorDoEmprestimo);
        
        return new MostrarPropostasPM (propostas);
        }
        else {
            return null;
        }
    }

    public void validar() {
        
        MsgErro = "";
        if(nome.equals (""));
        MsgErro += "nome vazio\n";
        
        if(salario <= 0)
            MsgErro +="Salario vazio\n";
        
        if(idade <= 0)
            MsgErro +="idade vazia";
        else if (idade <18 || idade > 70) {
            MsgErro += "idade invalida";
        }
        
        if(valorDoEmprestimo <0)
            MsgErro += "valor vazio";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setValorDoEmprestimo(float valorDoEmprestimo) {
        this.valorDoEmprestimo = valorDoEmprestimo;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public float getValorDoEmprestimo() {
        return valorDoEmprestimo;
    }

    public String getMsgErro() {
        return MsgErro;
    }

    public void setMsgErro(String MsgErro) {
        this.MsgErro = MsgErro;
    }
}
