package semana01.poo;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
