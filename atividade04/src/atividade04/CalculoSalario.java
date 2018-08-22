package atividade04;

import atividade04.Funcionario;
import java.util.List;

public class CalculoSalario {

    public CalculoSalario() {
    }
    public float calcular(float SalarioBase, String cargo) {
        float salarioFinal = 0f;

        if (cargo == "desenvolvedor") {
            if (SalarioBase >= 3000f) {
                return (SalarioBase - (SalarioBase * 0.2f));
            } else {
                return (SalarioBase - (SalarioBase * 0.1f));
            }
        }

        if (cargo == "DBA") {
            if (SalarioBase >= 2000f) {
                salarioFinal = SalarioBase - (SalarioBase * 0.25f);
            } else {
                salarioFinal = SalarioBase - (SalarioBase * 0.15f);
            }
        }

        if (cargo == "testador") {
            if (SalarioBase >= 2000f) {
                salarioFinal = SalarioBase - (SalarioBase * 0.25f);
            } else {
                salarioFinal = SalarioBase - (SalarioBase * 0.15f);
            }
        }

        if (cargo == "gerente") {
            if (SalarioBase >= 5000f) {
                salarioFinal = SalarioBase - (SalarioBase * 0.3f);
            } else {
                salarioFinal = SalarioBase - (SalarioBase * 0.2f);
            }
        }
        return salarioFinal;
    }
}
