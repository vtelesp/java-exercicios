package semana01.poo.empresa;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);

        if (linguagemPrincipal == null || linguagemPrincipal.isBlank()) {
            throw new IllegalArgumentException("Linguagem principal é inválida.");
        }
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }


    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }
}
