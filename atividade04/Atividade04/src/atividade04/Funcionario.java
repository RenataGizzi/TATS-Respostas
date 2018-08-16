package atividade04;

public class Funcionario {
    String nome;
    String email;
    float SalarioBase;
    String cargo;

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
