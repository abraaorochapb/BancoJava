package Entities;

public class Conta_banco {
    private String nome;
    private final int numero;
    private double depositoInicial;
    private double saldo;

    public Conta_banco(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public void setDepositoInicial(double depositoInicial){
        this.depositoInicial = depositoInicial;
        saldo += depositoInicial;
    }

    public double getSaldo(){
        return saldo;
    }

    public double deposito(double valor){
        this.saldo += valor;
        return this.saldo;
    }

    public String saque(double valor){
        if(this.saldo < valor + 5){
            return "Saldo insuficiente";
        }
        else{
            this.saldo -= (valor + 5);
            return "Saque realizado com sucesso, valor incluindo taxa: R$" + (valor + 5);
        }
    }
}
