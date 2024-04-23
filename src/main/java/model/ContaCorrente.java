
package model;

import model.Conta;

public class ContaCorrente extends Conta{
    private double saldo;
    private double taxaServico;

    public ContaCorrente() {
        this("", 0, 0);
    }
    
    public ContaCorrente(String nome, double saldo, double taxaServico) {
        super(nome);
        this.saldo = saldo;
        this.taxaServico = taxaServico;
    }

    @Override
    public double getSaldo() {
        return saldo = saldo - taxaServico;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
    
    @Override
    public void setDeposito (double valor) {
        saldo += valor;
    }
}
