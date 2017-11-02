package com.comercio;

public class Compra {

    int valorTotal;
    int numeroParcelas;

    // A vista
    public Compra(int valor) {
        valorTotal = valor;
        numeroParcelas = 1;
    }

    // Parcelado
    public Compra(int quantidadeParcelas, int valorParcela) {
        numeroParcelas = quantidadeParcelas;
        valorTotal = valorParcela * quantidadeParcelas;
    }

    public int getValorTotal () {
        return valorTotal;
    }

    public int getValorParcela () {
        return valorTotal / numeroParcelas;
    }
}
