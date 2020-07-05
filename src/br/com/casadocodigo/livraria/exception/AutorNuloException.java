package br.com.casadocodigo.livraria.exception;

public class AutorNuloException extends RuntimeException{
    public AutorNuloException(String mensagem){
        super(mensagem);
        //Estamos criando a nossa propria exception
    }
}
