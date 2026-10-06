package semana01.poo.empresa;

public class Main {
    public static void main(String[] args) {

    Funcionario joao = new Desenvolvedor("João", 5000, "Java");
    Funcionario maria = new Designer("Maria", 4000, "Figma");

        System.out.println("Bônus João: " + joao.calcularBonus());
        System.out.println("Bônus Maria: " + maria.calcularBonus());

    }
}
