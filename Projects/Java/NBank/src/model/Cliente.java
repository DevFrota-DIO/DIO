package model;

public class Cliente {
    private String idCliente;
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta();
        this.idCliente = this.cpf.substring(9) + this.conta.numConta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Conta getConta() {
        return this.conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
