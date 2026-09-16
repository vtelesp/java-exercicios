package semana01.metodos;

public class ValidacaoCategoria {
    public static boolean categoriaValida (String categoria) {
        if (!"Eletrônico".equals(categoria) && !"Livro".equals(categoria) && !"Alimento".equals(categoria)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String categoriaProduto = "Calçados";


        System.out.println("A categoria é válida?: " + categoriaValida(categoriaProduto));
    }
}
