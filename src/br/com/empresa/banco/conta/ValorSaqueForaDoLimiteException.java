package br.com.empresa.banco.conta;

public class ValorSaqueForaDoLimiteException extends RuntimeException{
    ValorSaqueForaDoLimiteException(Double valor, Double limite) {
        super("Valor de saque: "+valor+" fora do limite: "+limite);
    }
}
