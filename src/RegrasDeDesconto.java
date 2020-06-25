public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor lunga = new Autor();
        lunga.setNome("Lunga");

        Livro bacurau = new LivroFisico(lunga);
        bacurau.setValor(59.90);



       /* if (!bacurau.aplicaDesconto(0.3)){
            System.out.println("Desconto no livro não pode ser maior do que 30%");
        }else{
            System.out.println("Valor do Livro com desconto" + bacurau.getValor());
        }
*/
        Ebook ebook = new Ebook(lunga);
        ebook.setValor(29.90);

        if (!ebook.aplicaDesconto(0.15)){
            System.out.println("Desconto maior que 15%");
        }else{
            System.out.println("Valor do Ebook com desconto" + ebook.getValor());
        }

    }
}
