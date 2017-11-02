package com.carros;

public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.potencia = 10;
        carro1.nome = "Corcel";
        carro1.velocidade = 0;

        carro1.acelerar();
        carro1.imprimir();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.imprimir();
    }

}
