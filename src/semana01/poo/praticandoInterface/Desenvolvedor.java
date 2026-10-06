package semana01.poo.praticandoInterface;

public class Desenvolvedor extends Funcionario implements Autenticavel {
    private String linguagemPrincipal;
    private String senha;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal, String senha) {
        super(nome, salario);

        if (linguagemPrincipal == null || linguagemPrincipal.isBlank()) {
            throw new IllegalArgumentException("Linguagem Principal inválida.");
        }
        this.linguagemPrincipal = linguagemPrincipal;

        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("Senha inválida.");
        }
        this.senha = senha;
    }


    @Override
    public double calcularBonus() {
        return getSalario() * 0.1;
    }


    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

}
