package com.imc;

public class Paciente {
    private final double peso;
    private final double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC() {
        return (peso / (altura * altura));
    }

    public String diagnostico() {

        double imc = calculaIMC();

        if (imc < 16) {
            return "Baixo peso muito grave";
        }
        else if (imc < 16.99) {
            return "Baixo peso grave";
        }
        else if (imc < 18.49) {
            return "Baixo peso";
        }
        else if (imc < 24.99) {
            return "Peso normal";
        }
        else if (imc < 29.99) {
            return "Sobrepeso";
        }
        else if (imc < 34.99) {
            return "Obesidade grau I";
        }
        else if (imc < 39.99) {
            return "Obesidade grau II";
        }

        return "Obesidade grau III";

    }
}
