package semana01.poo.praticandoInterface;

import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();


    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            throw new IllegalArgumentException("Funcionário inválido.");
        }
        funcionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }

    public double calcularBonusTotal() {
        double bonusTotal = 0;

        for (Funcionario funcionario : funcionarios) {
            bonusTotal += funcionario.calcularBonus();
        }
        return bonusTotal;
    }
}
