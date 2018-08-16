package atividade04;
import atividade04.Funcionario;
import java.util.List;

public class CalculoSalario {
    
    public List<SalarioFinal> calculoSalario(String cargo, float SalarioBase) {
    ArrayList<SalarioFinal> salarios = new ArrayList<>();
    
    if ( cargo == "desenvolvedor" ) {
        if(salarioBase >= 3000f) {
        salario.add(new salarioBase (salarioBase - 20%));
        }
        else {
        salarios.add(new salarioBase (salarioBase - 10%));
        }
    }
    
    if ( cargo == "DBA") {
        if(salarioBase >= 2000f) {
        salario.add(new salarioBase (salarioBase - 25%));
        }
        else {
        salarios.add(new salarioBase (salarioBase - 15%));
        }
    }
    
    if ( cargo == "testador") {
        if(salarioBase >= 2000f) {
        salario.add(new salarioBase (salarioBase - 25%));
        }
        else {
        salarios.add(new salarioBase (salarioBase - 15%));
        }
    }
    
    if ( cargo == "gerente") {
        if(salarioBase >= 5000f) {
        salario.add(new salarioBase (salarioBase - 30%));
        }
        else {
        salarios.add(new salarioBase (salarioBase - 20%));
        }
    }
  }
    return salarios;
}
