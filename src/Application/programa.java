package Application;

import Entities.Conta_banco;

import java.util.Scanner;

public class programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o numero desejado para a conta: ");
        int numero = sc.nextInt();

        Conta_banco conta = new Conta_banco(nome, numero);

        System.out.print("Deseja fazer um deposito inicial? (s/n) ");
        char resp = sc.next().charAt(0);
        if(resp == 's'){
            System.out.print("Digite o valor do deposito inicial: R$");
            double depositoInicial = sc.nextDouble();
            conta.setDepositoInicial(depositoInicial);
        }

        System.out.println("Titular: " + nome + ", Numero da conta: " + numero + ", Saldo: R$" + conta.getSaldo());

        System.out.print("Deseja fazer um saque? (s/n)");
        resp = sc.next().charAt(0);
        if(resp == 's'){
            System.out.print("Digite o valor do saque: R$");
            double valorSaque = sc.nextDouble();
            System.out.println(conta.saque(valorSaque));
            System.out.println("Titular: " + nome + ", Numero da conta: " + numero + ", Saldo: R$" + conta.getSaldo());
        }

        System.out.print("Deseja fazer um deposito? (s/n)");
        resp = sc.next().charAt(0);
        if(resp == 's'){
            System.out.print("Digite o valor do deposito: R$");
            double deposito = sc.nextDouble();
            conta.deposito(deposito);
            System.out.println("Titular: " + nome + ", Numero da conta: " + numero + ", Saldo: R$" + conta.getSaldo());
        }

        sc.close();
    }

}
