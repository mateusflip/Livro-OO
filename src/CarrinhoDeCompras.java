public class CarrinhoDeCompras {
   private double total;
    public void adiciona(Livro livro){
        System.out.println("Adicionado " + livro);
        livro.aplicaDesconto(0.16); // Vai ser executado o método da classe em questão e dnão da classe pai
        total += livro.getValor();
    }
    public double getTotal(){
        return total;
    }
}
