package br.com.empresa.banco.conta;




public class ValorInvalidoException extends Exception{

    ValorInvalidoException(Double valor) {
        super("Valor Inválido: "+valor);
    }
}
