package semana01.poo.praticandoInterface;

public class Designer extends Funcionario {
    private String ferramentaPrincipal;

    public Designer(String nome, double salario, String ferramentaPrincipal) {
        super(nome, salario);

        if (ferramentaPrincipal == null || ferramentaPrincipal.isBlank()) {
            throw new IllegalArgumentException("Ferramenta principal inválida.");
        }
        this.ferramentaPrincipal = ferramentaPrincipal;
    }


    @Override
    public double calcularBonus() {
        return getSalario() * 0.08;
    }

}
