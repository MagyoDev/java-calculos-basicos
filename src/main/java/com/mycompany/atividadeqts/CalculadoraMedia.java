package com.mycompany.atividadeqts;

public class CalculadoraMedia {

    public double calcularMedia(double... valores) {
        if (valores.length == 0) {
            throw new IllegalArgumentException("A lista de valores não pode estar vazia.");
        }
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
}

