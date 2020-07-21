public class ConsultaDeDesconto {
    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        Double desconto = gerenciador.validaCupom("cab11");

        if(desconto != null){
            System.out.println("Cupom de Desconto Válido");
            System.out.println("Valor" + desconto);
        }else{
            System.out.println("Cupom de Desconto não existe");
        }
    }
}
