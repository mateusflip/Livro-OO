public class CadastroDeLivros {



    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mateus Ramos");
        autor.setEmail("mateus.ramos1337@gmail.com");

        autor.setCpf("56874156548");


        Livro livro = new LivroFisico(autor); //Passando um autor como um parametro devido ao nosso construtor

        livro.setNome("Cálculo1");
        livro.setDescricao("Um livro sobe cálculo 1 sobre integrais");
        livro.setIsbn("1866815132");
        livro.setValor(50);
        livro.autor = autor;


        livro.mostraInfos();


        //Criando outro livro

        Autor outroAutor = new Autor();
        outroAutor.setCpf("18997654796");
        outroAutor.setNome("Raíssa Martins");
        outroAutor.setEmail("raissa.martins@gmail.com");

        Livro outroLivro = new LivroFisico(outroAutor); //devido ao construtor devemos passar um parametro autor para o novo livro que está sendo criado
        outroLivro.setNome("Cálculo2");
        outroLivro.setDescricao("Livro de cálculo 2 bem mais dificil que o primeiro, se prepare");
        outroLivro.setIsbn("2315168321");
        outroLivro.setValor(60);
        outroLivro.autor = outroAutor;


        outroLivro.mostraInfos();


    }
}
