package semana01.poo.praticandoInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CadastroFuncionarios cadastrados = new CadastroFuncionarios();

        Funcionario joao = new Desenvolvedor("João", 5000,"Java","klv2405");
        Funcionario maria = new Designer("Maria",3500,"Figma");
        Funcionario caique = new Designer("Caique", 3000,"Figma");
        Funcionario luana = new Desenvolvedor("Luana", 4600,"JavaScript","psswrdKtw");

        cadastrados.adicionarFuncionario(joao);
        cadastrados.adicionarFuncionario(maria);
        cadastrados.adicionarFuncionario(caique);
        cadastrados.adicionarFuncionario(luana);

        cadastrados.exibirFuncionarios();

        double resultadoBonusTotal = cadastrados.calcularBonusTotal();

        System.out.println("O bônus total é de: " + resultadoBonusTotal);


        //System.out.println("Bônus de João: " + joao.calcularBonus());
        //System.out.println("Bônus de Maria: " + maria.calcularBonus());

        //Autenticavel usuario = new Desenvolvedor("Thiago", 4500,"Java","psswrd");
        //System.out.println(usuario.autenticar("psswrd"));
        //System.out.println(usuario.autenticar("pswrd"));




    }
}
