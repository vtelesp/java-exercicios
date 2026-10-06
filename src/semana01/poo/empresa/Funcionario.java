package semana01.poo.empresa;

public class Funcionario {
    private String nome;
    private double salario;


    public Funcionario(String nome, double salario) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;

        if (salario <= 0) {
            throw new IllegalArgumentException("Salário inválido.");
        }
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }


    public double calcularBonus() {
        return getSalario() * 0.05;
    }

}
