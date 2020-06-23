public class RegistroDeVendas {

    private double total;
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mateus Ramos");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Banco de Dados");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Banco de Dados - Ebook");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total da compra " + carrinho.getTotal());


    }

}
