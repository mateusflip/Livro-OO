package br.com.casadocodigo.livraria;

public class Autor {

    private String nome;
    private String email;
    private String cpf;



    public void infosAutor(){
        System.out.println("As informações do Autor são:");
        System.out.println(nome);
        System.out.println(email);
        System.out.println(cpf);
    }

    //Métodos Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String spf) {
        this.cpf = spf;
    }
}
