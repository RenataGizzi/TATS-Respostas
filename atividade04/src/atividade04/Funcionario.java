package atividade04;

public class Funcionario {
    String nome;
    String email;
    float SalarioBase;
    String cargo;
    String MsgErro;
    
    public Funcionario () {}
    
    public float pressionarBotaoCalcular () {
        validar();
        CalculoSalario calc = new CalculoSalario ();
        float salarioFinal = calc.calcular(SalarioBase, cargo);
        
        return salarioFinal; 
    }

    public void validar() {
        
        MsgErro = "";
        if(nome == "") {
            MsgErro = "Nome vazio! Informe um nome válido.\n";
        }
        if(email == " ") {
            MsgErro = "E-mail vazio! Informe um e-mail válido.\n";
        }
        if (SalarioBase <= 0) {
            MsgErro = "Salário inválido. Informe um salário maior que zero.\n";
        }
        if(cargo == " ") {
            MsgErro = "Cargo vazio. Informe um cargo válido.\n";
        }
        else if (cargo != "desenvolvedor" || cargo != "DBA" || cargo != "testador" || cargo != "gerente") {
            MsgErro = "Cargo inválido. Informe um cargo válido.\n";
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalarioBase(float SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public float getSalarioBase() {
        return SalarioBase;
    }

    public String getCargo() {
        return cargo;
    }
    
    
}
