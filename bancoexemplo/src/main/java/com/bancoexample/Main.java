package com.bancoexample;

public class Main {
    public static void main(String[] args) {
        Cliente murilo = new Cliente();
        murilo.setNome("Murilo");

        Conta contaCorrente = new ContaCorrente(murilo);
        Conta contaPoupanca = new ContaPoupanca(murilo);

        contaCorrente.depositar(3000);
        contaCorrente.transferir(2000, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}