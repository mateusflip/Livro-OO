import java.util.*;

public class GerenciadorDeCupons {
    private Map<String, Double> cupons; //Estamos criando uma referencia de chave (String) que retornará um valor (double)

    public GerenciadorDeCupons() {

        this.cupons = new HashMap<>();
        cupons.put("cab11", 10.0); //Criação do valor de referência (String) e seu retorno.
        cupons.put("cab22", 12.0);
        cupons.put("cab33", 13.0);
        cupons.put("cab44", 14.0);
    }

    public Double validaCupom(String cupom){
        return this.cupons.get(cupom);
    }


}
