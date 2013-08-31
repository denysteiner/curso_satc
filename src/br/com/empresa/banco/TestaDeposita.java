package br.com.empresa.banco;

import br.com.empresa.banco.conta.ValorInvalidoException;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.Conta;

public class TestaDeposita {
    public static void main(String[] args) {
        Conta cp = new ContaCorrente();
        try {
            cp.deposita(-10);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        try {
            cp.deposita(-10);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
