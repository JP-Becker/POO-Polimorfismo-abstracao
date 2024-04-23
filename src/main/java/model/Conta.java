
package model;

public abstract class Conta {
    private String nome;
    
    public Conta() {
        this("");
    }
    
    public Conta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getSaldo();
    
    public void setDeposito(double deposito) {};
    
}
