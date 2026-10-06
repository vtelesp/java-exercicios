package semana01.poo.empresa;

public class Designer extends Funcionario {
    private String ferramentaPrincipal;

    public Designer(String nome, double salario, String ferramentaPrincipal) {
        super(nome, salario);

        if (ferramentaPrincipal == null || ferramentaPrincipal.isBlank()) {
            throw new IllegalArgumentException("Linguagem principal inválida.");
        }
        this.ferramentaPrincipal = ferramentaPrincipal;
    }

    public String getFerramentaPrincipal() {
        return ferramentaPrincipal;
    }


    @Override
    public double calcularBonus() {
        return getSalario() * 0.08;
    }
}
